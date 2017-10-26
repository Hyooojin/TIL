package visual_recognition;

import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.ClassifyImagesOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.VisualClassification;


public class VisualRecognitionTest {

	public static void main(String[] args) {
		VisualRecognition service = new VisualRecognition(VisualRecognition.VERSION_DATE_2016_05_20);
		service.setApiKey("aa29d227a370786ad28efc9a99632100a539ef29");

		System.out.println("Classify an image");
		ClassifyImagesOptions options = new ClassifyImagesOptions.Builder()
		    .url("https://bloximages.newyork1.vip.townnews.com/postbulletin.com/content/tncms/assets/v3/editorial/8/8c/88c6b3ca-139b-5a5b-99c7-a46ac8626833/587e2e9f89a1d.image.jpg?resize=1200%2C926")
		    .build();

//		ClassifyImagesOptions options = new ClassifyImagesOptions.Builder()
//			    .images(new File("C:/dev/image/o.jpg"))
//			    .build();

		VisualClassification result = service.classify(options).execute();
		System.out.println(result);
	}
}
