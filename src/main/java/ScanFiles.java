import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ScanFiles {


    public static void main(String[] args) {
        String folderPath = "C:\\Users\\wjs33\\Documents\\WeChat Files\\wang09-27\\FileStorage\\File\\2023-06"; // 文件夹路径

        File folder = new File(folderPath);

        // 检查文件夹是否存在
        if (folder.exists() && folder.isDirectory()) {
            scanFolder(folder);
        } else {
            System.out.println("文件夹不存在或者不是一个有效的文件夹路径！");
        }
    }

    public static List<String> scanFolder(File folder) {
        List<String> fileList = new ArrayList<String>();
        File[] files = folder.listFiles(); // 获取文件夹下的所有文件和文件夹

        // 遍历文件夹下的所有文件和文件夹
        for (File file : files) {
            if (file.isDirectory()) {
                scanFolder(file); // 递归调用，扫描子文件夹
            } else {
                fileList.add(file.getAbsolutePath());
                System.out.println(file.getAbsolutePath()); // 输出文件路径
            }
        }
        return fileList;
    }

}
