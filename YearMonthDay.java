package copy;

import java.io.File;

class getJpgFromFolder {
	String years=null,month=null,day=null,JpgName=null;
	String AA=null;
	String BB=null;
	File file = null;
	MoveAtoB AtoB = null;
	fileMoniter filemonitor = null;
	StringSingleSimple stringsinglesimple = new StringSingleSimple().getStringSingleSimple();
	public	getJpgFromFolder() {
		
	}
	public	getJpgFromFolder(String Directory,String AFolderDirctory,String BFolderDirctory) {
		file = new File(Directory);
		AtoB = new MoveAtoB();
		//filemonitor = new fileMoniter();
		AtoB.start();
		//filemonitor.start();
		scannerJpgFromFolder(Directory, AFolderDirctory, BFolderDirctory);
		
	}
	public void scannerJpgFromFolder(String Directory,String AFolderDirctory,String BFolderDirctory) {
		file = new File(Directory);
			if(file.exists()) {
					//年份的判断
					File[] YearFiles = file.listFiles();
					if(YearFiles.length == 0) {
						System.out.println("文件夹暂时无文件夹！");
						return ;
					}else {
						for(int i = 0 ; i< YearFiles.length; i++) {
							if(YearFiles[i].isDirectory()) {
								years = YearFiles[i].getName();
								System.out.println(YearFiles[i].getName());
								//月份的判断
								File[] MonthFiles = YearFiles[i].listFiles();
								if(MonthFiles.length == 0)
									continue ;
								for(int j = 0 ;j< MonthFiles.length ;j++) {
									if(MonthFiles[j].isDirectory()) {
										month = MonthFiles[j].getName();
										System.out.println(MonthFiles[j].getName());
										//日期的判断
										File[] DateFiles = MonthFiles[j].listFiles();
										if(DateFiles.length == 0)
											continue ;
										for(int k = 0;k< DateFiles.length;k++) {
											if(DateFiles[k].isDirectory()) {
												day = DateFiles[k].getName();
												System.out.println(DateFiles[k].getName());
												//文件的判断
												File[] jpgs = DateFiles[k].listFiles();
												if(jpgs.length == 0) 
													continue;
												for(int l = 0; l<jpgs.length ;l++) {
													JpgName = jpgs[l].getName();
													if(jpgs[l].isFile() && 
															jpgs[l].toString().endsWith(".jpg")) {
														System.out.println(jpgs[l]);
														System.out.println("JpgName的值是："+JpgName);
														AA = AFolderDirctory+"\\"+years+"\\"+month+"\\"+day+"\\"+JpgName;
														BB = BFolderDirctory+"\\"+years+"_"+month
																+"_"+day+"_"+JpgName;
														stringsinglesimple.setAA(AA);
														stringsinglesimple.setBB(BB);
														//AtoB.FileMoveAtoB(AA,BB);
														//filemonitor.FileMoniterFront(AA, BB);
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
					System.out.println("文件夹暂时无内容！");
				}
			}
}
