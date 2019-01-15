public class SystemInfo {
    
	
	 public static void main(String[] args) throws IOException {
    	File file = new File("./xuqi/myanswer.txt"); 
    	file.createNewFile();
    	FileWriter resultFile = new FileWriter(file);   
    	PrintWriter myFile = new PrintWriter(resultFile);   
    	
    	System.getProperties().list(myFile);;
    	resultFile.close();
    }
}
