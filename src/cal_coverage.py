import os
import shutil


def copy_java_files(src_folder, dest_folder):
    # 遍历源文件夹下的所有文件和子文件夹
    for root, dirs, files in os.walk(src_folder):
        # 遍历每个子文件夹中的所有文件
        for file in files:
            if file.endswith(".java"):
                # 构造源文件的路径
                src_file_path = os.path.join(root, file)
                # 构造目标文件的路径
                dest_file_path = os.path.join(dest_folder, file)
                # 复制文件
                shutil.copy2(src_file_path, dest_file_path)

# 指定源文件夹和目标文件夹路径
src_folder_path = "../result/2924%_cal_coverage/"
dest_folder_path = "../result/2924_coverage_reslut"

# 创建目标文件夹（如果不存在）
if not os.path.exists(dest_folder_path):
    os.makedirs(dest_folder_path)

# 复制所有的 .java 文件
copy_java_files(src_folder_path, dest_folder_path)
