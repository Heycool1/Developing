public class Boook {
    String title;
    String author;
    int pages;
    void getBookInfo(String title , String author , int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
        System.out.println(title + " book is written by " + author + " is " + pages + "pages.");
    }
    void isBookLong(int pages){
        this.pages = pages;
        if(pages>300){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
