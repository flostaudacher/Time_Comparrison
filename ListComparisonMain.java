
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ListComparisonMain{
	final static int EXECUTIONS = 1000;
	public static Map<Integer, Runnable> DCLmethods = new HashMap<>();
	public static Map<Integer, Runnable> LLmethods = new HashMap<>();
	public static Map<Integer, Runnable> ArrayMethods = new HashMap<>();
	public static int[] arr = new int[EXECUTIONS * 3 + 1];
	public static List l = new List(10);
	public static LinkedList<Integer> ll = new LinkedList<Integer>();


	public static void main(String args[])throws IOException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm");
		LocalDateTime now = LocalDateTime.now();
		String timeStamp = dtf.format(now);
		File file = new File("C:\\Users\\flost\\eclipse-workspace\\Comparrison\\TextFileComparrison\\"+timeStamp+"_Staudacher");
		file.createNewFile();
		FileWriter fw = new FileWriter(file);

		ll.add(1);
		arr[0] = 1;
		HashmapForComp.populateDCLHash();
		HashmapForComp.populateLLHash();
		HashmapForComp.popuplateArrHash();

		System.out.println("Durchläufe: "+EXECUTIONS);
		System.out.println("\tMethode\t\t|\tMyList\t\t|\tLinkedList\t|\tArray");
		System.out.println("------------------------+-----------------------+-----------------------+--------------------");
		try {
			fw.write("Durchläufe: "+EXECUTIONS+"\n");
			fw.write("\tMethode\t\t|\tMyList\t\t|\tLinkedList\t|\tArray\n");
			fw.write("------------------------+-----------------------+-----------------------+--------------------\n");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			compareMethods("length", 0, fw);
			compareMethods("addHead", 1, fw);
			compareMethods("addTail", 2, fw);
			compareMethods("addElem", 3, fw);
			compareMethods("swap", 4, fw);
			compareMethods("delete", 5, fw);
			compareMethods("delTail", 6, fw);
			compareMethods("delHead", 7, fw);
		} catch (IOException e) {
			System.out.println("ERROR while creating the file !");
			e.printStackTrace();
		} 
		fw.flush();
		fw.close();
	}
	public static void compareMethods(String methodName, int method, FileWriter fw) throws IOException {
		
		long time = methodTime(DCLmethods, method);
		System.out.print("\t"+methodName+"\t\t|\t"+time+"ns\t|");
		fw.write("\t"+methodName+"\t\t|\t"+time+"ns\t|");    

		time = methodTime(LLmethods, method);
		System.out.print("\t"+time+"ns\t|");
		fw.write("\t"+time+"ns\t|"); 

		time = methodTime(ArrayMethods, method);
		System.out.println("\t"+time+"ns");
		fw.write("\t"+time+"ns"); 
		fw.write("\n");
		
	}
	public static long methodTime(Map<Integer, Runnable> map, int method) {
		long startTime = getCurrentTime();
		for (int i = 0; i < EXECUTIONS; i++) {
			map.get(method).run();
		}
		return getTime(startTime);
	}
	public static long getTime(long startTime) {
		return getCurrentTime() - startTime;
	}
	public static long getCurrentTime() {
		return System.nanoTime();
	}

}