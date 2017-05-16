package cn.svm.classifier;

import java.io.IOException;
import cn.svm.lib.*;

/**
 * @author xixy10@foxmail.com
 * @version V0.1 2017年5月16日 下午1:01:57
 */

/**
 *
 */
public class LibSVMTest {

	public static String trainData = "resources/trainfile/trainData";
	public static String model = "resources/trainfile/model";
	public static String testData = "resources/trainfile/testData";
	public static String outPut = "resources/trainfile/out";

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String[] arg = { trainData, model };
		String[] parg = { "-b", "0", testData, model, outPut };
		System.out.println("SVM Starts");
		svm_train t = new svm_train();
		svm_predict p = new svm_predict();
		t.main(arg);
		p.main(parg);
	}

}
