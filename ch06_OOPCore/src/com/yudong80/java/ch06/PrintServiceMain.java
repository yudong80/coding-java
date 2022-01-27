package com.yudong80.java.ch06;

class PrintServiceImpl implements PrintService {
    private String searched;

    @Override
    public boolean search(String name) {
        //4. 무조건 검색된다고 가정함
        searched = name;
        System.out.println(searched + "이 검색되었습니다.");
        return true;
    }

    @Override
    public boolean print(String file) {
        //5. pdf 파일만 출력 가능함 (파일명: OOO.pdf)
        boolean success = file.endsWith(".pdf");
        if (!success) {
          System.out.println(file + " 파일은 출력할 수 없습니다. pdf 파일만 출력 가능합니다.");
          return false;
        } 

        System.out.println(file + " 파일이 출력되었습니다.");
        return true;
    }
}

public class PrintServiceMain {
    public static void main(String[] args) {
        //1. 출력할 문서 리스트 
        String[] documents = {
            "coding-java.pdf",
            "learning-python.pdf",
            "java-examples.txt",
        };

        //2. 검색할 프린터 이름 
        String location = "우리집";

        //3. 검색과 문서 출력
        PrintService service = new PrintServiceImpl();
        boolean searched = service.search(location);
        if (searched) {
            for (String file : documents) {
                service.print(file);
            }
        }
    }
}
