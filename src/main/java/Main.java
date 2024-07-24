import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        try {
            CrptApi api = new CrptApi(TimeUnit.MINUTES, 10);

            Document.Description description = new Document.Description();
            description.setParticipantInn("string");

            Document.Product product = new Document.Product();
            product.setCertificate_document("string");
            product.setCertificate_document_date("2020-01-23");
            product.setCertificate_document_number("string");
            product.setOwner_inn("string");
            product.setProducer_inn("string");
            product.setProduction_date("2020-01-23");
            product.setTnved_code("string");
            product.setUit_code("string");
            product.setUitu_code("string");

            Document document = new Document();
            document.setDescription(description);
            document.setDoc_id("string");
            document.setDoc_status("string");
            document.setDoc_type("LP_INTRODUCE_GOODS");
            document.setImportRequest(true);
            document.setOwner_inn("string");
            document.setParticipant_inn("string");
            document.setProducer_inn("string");
            document.setProduction_date("2020-01-23");
            document.setProduction_type("string");
            document.setProducts(Arrays.asList(product));
            document.setReg_date("2020-01-23");
            document.setReg_number("string");

            String signature = "signature_string";
            api.createDocument(document, signature);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
