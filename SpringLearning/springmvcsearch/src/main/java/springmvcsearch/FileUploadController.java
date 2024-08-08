package springmvcsearch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	
	@RequestMapping("/fileform")
	public String showUploadForm()
	{
		String str=null;
		System.out.println(str.length());
		return "fileform";
	}
	
	@RequestMapping(value="/uploadimage",method=RequestMethod.POST)
	public String fileupload(@RequestParam("profile") CommonsMultipartFile file,HttpSession s,Model m)
	{
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		byte [] data=file.getBytes();
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"image"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		
		//upload to server
		try {
			FileOutputStream fos=new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println(" File Upload..");
			m.addAttribute("filename",file.getOriginalFilename());
			m.addAttribute("msg","Uploaded successfully");
			
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println("Uploading error");
			m.addAttribute("msg","Uploading error");
		}
		
		
		
		return "filesuccess";
	}

}
