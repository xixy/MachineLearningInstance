package cn.svm.data;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author xixy10@foxmail.com
 * @version V0.1 2017年5月16日 上午9:38:19
 */

/**
 *
 */
public class DataGenerator {
	public static Map<Float, Float> class1Data = new HashMap<Float, Float>();
	public static Map<Float, Float> class2Data = new HashMap<Float, Float>();

	public static void generateData() throws IOException {
		File file = new File("resources/trainfile/trainData");
		FileWriter fileWriter = new FileWriter(file);
		String s = "";

		float number = 0;
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			s += "1";
			s += "\t";
			number = (float) random.nextGaussian();
			s += "1:";
			s += number;
			s += "\t";
			number = (float) random.nextGaussian();
			s += "2:";
			s += number;
			s += "\t";
			s += "\n";
		}

		for (int i = 0; i < 100; i++) {
			s += "-1";
			s += "\t";
			number = (float) random.nextGaussian() + 10;
			s += "1:";
			s += number;
			s += "\t";
			number = (float) random.nextGaussian() + 10;
			s += "2:";
			s += number;
			s += "\t";
			s += "\n";
		}
		fileWriter.write(s);
		fileWriter.close();
	}

	public static void main(String[] args) throws IOException {
		generateData();
	}

}
