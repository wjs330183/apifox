import okhttp3.*;

import java.io.IOException;

public class TablesTasks {

    public void createTablesTasks() throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("https://supertext.ai-indeed.com/supertextapi/api/tables/tasks/")
                .method("POST", body)
                .addHeader("Token-Supertext", "42B66D2C4D11923DFAEF6C72FD4363C2EB1124C9895A4A7EE8FF5E8876FA30121213BEE4CF7135019B1A4DA15FE7C196")
                .addHeader("User-Agent", "Apifox/1.0.0 (https://apifox.com)")
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();

    }

    public void getTablesTasksDetail_v2() throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("https://supertext.ai-indeed.com/supertextapi/api/tables/tasks//")
                .method("GET", body)
                .addHeader("Token-Supertext", "42B66D2C4D11923DFAEF6C72FD4363C2EB1124C9895A4A7EE8FF5E8876FA30121213BEE4CF7135019B1A4DA15FE7C196")
                .addHeader("User-Agent", "Apifox/1.0.0 (https://apifox.com)")
                .build();
        Response response = client.newCall(request).execute();
    }

    public void getTablesTasksList() throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("https://supertext.ai-indeed.com/supertextapi/api/tables/tasks/?fuzzy_task_name=&template_code=&status=&start_date=&end_date=")
                .method("GET", body)
                .addHeader("Token-Supertext", "42B66D2C4D11923DFAEF6C72FD4363C2EB1124C9895A4A7EE8FF5E8876FA30121213BEE4CF7135019B1A4DA15FE7C196")
                .addHeader("User-Agent", "Apifox/1.0.0 (https://apifox.com)")
                .build();
        Response response = client.newCall(request).execute();
    }


    public void getTablesTasksDetail() throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("https://supertext.ai-indeed.com/supertextapi/api/tables/tasks//")
                .method("GET", body)
                .addHeader("Token-Supertext", "42B66D2C4D11923DFAEF6C72FD4363C2EB1124C9895A4A7EE8FF5E8876FA30121213BEE4CF7135019B1A4DA15FE7C196")
                .addHeader("User-Agent", "Apifox/1.0.0 (https://apifox.com)")
                .build();
        Response response = client.newCall(request).execute();
    }


    public void downloadTablesTasksExcelFiles() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("https://supertext.ai-indeed.com/supertextapi/api/tables/tasks//excel_files/")
                .method("GET", body)
                .addHeader("Token-Supertext", "42B66D2C4D11923DFAEF6C72FD4363C2EB1124C9895A4A7EE8FF5E8876FA30121213BEE4CF7135019B1A4DA15FE7C196")
                .addHeader("User-Agent", "Apifox/1.0.0 (https://apifox.com)")
                .build();
        Response response = client.newCall(request).execute();
    }

    public void createTablesTasksTemplates() throws IOException {

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("https://supertext.ai-indeed.com/supertextapi/api/tables/templates/")
                .method("POST", body)
                .addHeader("Token-Supertext", "42B66D2C4D11923DFAEF6C72FD4363C2EB1124C9895A4A7EE8FF5E8876FA30121213BEE4CF7135019B1A4DA15FE7C196")
                .addHeader("User-Agent", "Apifox/1.0.0 (https://apifox.com)")
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();

    }


    public void getTablesTasksTemplates() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("https://supertext.ai-indeed.com/supertextapi/api/tables/templates/")
                .method("GET", body)
                .addHeader("Token-Supertext", "42B66D2C4D11923DFAEF6C72FD4363C2EB1124C9895A4A7EE8FF5E8876FA30121213BEE4CF7135019B1A4DA15FE7C196")
                .addHeader("User-Agent", "Apifox/1.0.0 (https://apifox.com)")
                .build();
        Response response = client.newCall(request).execute();
    }

    public void getTablesTasksTemplatesList() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("https://supertext.ai-indeed.com/supertextapi/api/tables/templates/")
                .method("GET", body)
                .addHeader("Token-Supertext", "42B66D2C4D11923DFAEF6C72FD4363C2EB1124C9895A4A7EE8FF5E8876FA30121213BEE4CF7135019B1A4DA15FE7C196")
                .addHeader("User-Agent", "Apifox/1.0.0 (https://apifox.com)")
                .build();
        Response response = client.newCall(request).execute();
    }

}
