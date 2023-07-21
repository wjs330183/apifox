import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestFlow {

    public static void main(String[] args) {
        String folderPath = "C:\\Users\\wjs33\\Documents\\WeChat Files\\wang09-27\\FileStorage\\File\\2023-06"; // 文件夹路径

        File folder = new File(folderPath);
        List<String> fileList = new ArrayList<String>();
        // 检查文件夹是否存在
        if (folder.exists() && folder.isDirectory()) {
            fileList = ScanFiles.scanFolder(folder);
        } else {
            System.out.println("文件夹不存在或者不是一个有效的文件夹路径！");
        }
        fileList.forEach(fileName -> {
            System.out.println(fileName);

        });

    }
}
