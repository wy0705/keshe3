/*
package com.lmonkey.servlet.file;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import  org.apache.commons.fileupload.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
@WebServlet("uploadServlet")
public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //先判断上传的数据是否为多段数据
        if (ServletFileUpload.isMultipartContent(req)){
            //创建FileItemFactory工厂类
            FileItemFactory fileItemFactory=new DiskFileItemFactory();
            //创建用于解析上传数据的工具类ServletFileUpload
            ServletFileUpload servletFileUpload=new ServletFileUpload(fileItemFactory);
            try {
                List<FileItem> list=servletFileUpload.parseRequest(req);
                for (FileItem fileItem :list){
                    if (fileItem.isFormField()){
                        //普通表单项
                        System.out.println(fileItem.getFieldName());
                        System.out.println(fileItem.getString("UTF-8"));
                    }else {
                        //上传的文件
                        System.out.println("表单项的name属性值："+fileItem.getFieldName());
                        System.out.println("上传的文件名："+fileItem.getName());
                        fileItem.write(new File("/home/lxh"+fileItem.getName()));
                    }

                }
            } catch (FileUploadException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
*/
