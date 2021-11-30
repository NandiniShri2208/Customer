import java.util.Arrays;

public class Video {
    String title;
    boolean flag[]=new boolean[10];
    int rating[]=new int[10];
    void being_checkedOut(int index){
        if(flag[index]){
            flag[index]=false;
        }
    }
    void being_returned(int index){
        if(flag[index] == false){
            flag[index]=true;
        }
    }
    void receive_rating(int n,int no){
        rating[n]=no;
    }
}
class VideoStore extends Video {
    int[] rate = new int[10];
    String arr[] = new String[10];
    int i = 0;

    void addVideo(String title) {
        arr[i++] = title;
        System.out.println("video added....");
    }

    void checkOut(String s) {
        int index = 0;
        for (int i = 0; i < 3; i++) {
            if (s.equals(arr[i])) {
                index = i;
            }
        }
        being_checkedOut(index);


    }

    void returnVideo(String video) {
        int index = 0;
        for (int i = 0; i < 3; i++) {
            if (video.equals(arr[i])) {
                index = i;
            }
        }
        being_returned(index);
    }

    void receiveRating(int n, int rating) {
        rate[n] = rating;
        receive_rating(n, rating);
    }

    void listInventory() {
        for (int i = 0; i < 3; i++) {
            if (flag[i] == true) {
                System.out.println(arr[i] + " " + flag[i]);
            }
        }

    }

    static class VideoStoreLauncher {
        public static void main(String[] args) {
            VideoStore obj1 = new VideoStore();
            Arrays.fill(obj1.flag, true);
            obj1.addVideo("The Matrix");
            obj1.addVideo("Godfather II");
            obj1.addVideo("Star Wars Episode IV: A New Hope");
            obj1.receiveRating(0, 5);
            obj1.receiveRating(1, 4);
            obj1.checkOut("The Matrix");
            obj1.checkOut("Godfather II");
            obj1.checkOut("Star Wars Episode IV: A New Hope");
            obj1.returnVideo("Star Wars Episode IV: A New Hope");
            obj1.returnVideo("The Matrix");
            obj1.returnVideo("Godfather II");
            obj1.listInventory();
            obj1.checkOut("Godfather II");
            obj1.listInventory();
        }
    }
}