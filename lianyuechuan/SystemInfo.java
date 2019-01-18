public class SystemInfo {
    
	public static void main(String[] args) {
		File file = new File("myanswer.txt"); 
    	file.createNewFile();
    	FileWriter outFile = new FileWriter(file);   
    	PrintWriter myFile = new PrintWriter(outFile);   
    	System.getProperties().list(myFile);;
    	resultFile.close();
		
		
	}
}