import okhttp3.*;

import java.io.File;
import java.io.IOException;

public class UploadFile {

    /**
     * {
     * "code": 0,
     * "msg": "string",
     * "data": {
     * "fileHash": "string",
     * "templateIdSuggested": 0
     * }
     * }
     *
     * @throws IOException
     */
    public void uploadFile(String url,String filePath) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("multipart/form-data");
        RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                .addFormDataPart("file", "",
                        RequestBody.create(MediaType.parse("application/octet-stream"),
                                new File(filePath)))
                .addFormDataPart("module", "FINANCIAL-ANALYSIS")
                .addFormDataPart("origin", "")
                .build();
        Request request = new Request.Builder()
                .url(url)
                .method("POST", body)
                .addHeader("Token-Supertext", "42B66D2C4D11923DFAEF6C72FD4363C2EB1124C9895A4A7EE8FF5E8876FA30121213BEE4CF7135019B1A4DA15FE7C196")
                .addHeader("User-Agent", "Apifox/1.0.0 (https://apifox.com)")
                .addHeader("Content-Type", "multipart/form-data")
                .build();
        Response response = client.newCall(request).execute();
    }

}
