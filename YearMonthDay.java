package copy;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

class getJpgFromFolder {
	String years=null,month=null,day=null,JpgName=null;
	String AA=null;
	String BB=null;
	File file = null;
	MoveAtoB AtoB = new MoveAtoB();
	fileMoniter filemonitor = new fileMoniter();
	public	getJpgFromFolder() {
		
	}
	public	getJpgFromFolder(String Directory,String AFolderDirctory,String BFolderDirctory) {
		file = new File(Directory);
	}
	public void scannerJpgFromFolder(String Directory,String AFolderDirctory,String BFolderDirctory) {
		file = new File(Directory);
			if(file.exists()) {
					//��ݵ��ж�
					File[] YearFiles = file.listFiles();
					if(YearFiles.length == 0) {
						System.out.println("�ļ�����ʱ���ļ��У�");
						return ;
					}else {
						for(int i = 0 ; i< YearFiles.length; i++) {
							if(YearFiles[i].isDirectory()) {
								years = YearFiles[i].getName();
								System.out.println(YearFiles[i].getName());
								//�·ݵ��ж�
								File[] MonthFiles = YearFiles[i].listFiles();
								if(MonthFiles.length == 0)
									continue ;
								for(int j = 0 ;j< MonthFiles.length ;j++) {
									if(MonthFiles[j].isDirectory()) {
										month = MonthFiles[j].getName();
										System.out.println(MonthFiles[j].getName());
										//���ڵ��ж�
										File[] DateFiles = MonthFiles[j].listFiles();
										if(DateFiles.length == 0)
											continue ;
										for(int k = 0;k< DateFiles.length;k++) {
											if(DateFiles[k].isDirectory()) {
												day = DateFiles[k].getName();
												System.out.println(DateFiles[k].getName());
												//�ļ����ж�
												File[] jpgs = DateFiles[k].listFiles();
												if(jpgs.length == 0) 
													continue;
												for(int l = 0; l<jpgs.length ;l++) {
													JpgName = jpgs[l].getName();
													if(jpgs[l].isFile() && 
															jpgs[l].toString().endsWith(".jpg")) {
														System.out.println(jpgs[l]);
														System.out.println("JpgName��ֵ�ǣ�"+JpgName);
														AA = AFolderDirctory+"\\"+years+"\\"+month+"\\"+day+"\\"+JpgName;
														BB = BFolderDirctory+"\\"+years+"_"+month
																+"_"+day+"_"+JpgName;
														AtoB.FileMoveAtoB(AA,BB);
													}
												}
												
											}	
										}
										
									}	
								}
					
							}
						}
					}
				}else{
					System.out.println("�ļ�����ʱ�����ݣ�");
				}
			}
}

class AskFileName implements FilenameFilter{
	@Override
	public boolean accept(File file, String type) {
		// TODO Auto-generated method stub
		return false;
	}
}