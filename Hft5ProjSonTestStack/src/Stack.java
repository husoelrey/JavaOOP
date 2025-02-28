//LIFO YAPISI stack konusu

public class Stack {
    private int[] elements;
    private int size; //intlerin default değeri 0
    private static final int defaultCapacity=16;

    Stack() {
        this(defaultCapacity);
        System.out.println("size"+size);

    }

    Stack(int size) {
        elements=new int[size];

    }

    public void push(int value) {
        if (size>=elements.length){
            int[] temp=new int[elements.length*2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            //dizimizi yeni temp dizisine kopyaladık. tamamen aynılar tek fark temp dizisnin boyutu 2 katı
            //silerken de arraycopy kullanabiliriz yani diziyi daraltırken de kullanabiliriz genişletirken de
            elements=temp;
            //temptekini de eskiye atadık vee tamam. artık eski dizimizn boyuutunu da arttırmış oldduk.
            //arraylist kullansak tertemiz iş olacaktı bunlarla uğraşmaya gerek yok

        }
        elements[size++]=value; //size başlangıç değeri vermemiştik yani 0 olur
        //ilk 16 eleman için burası çalıştı çünkü dizi boyutu 16ydı. 0-15.indexler doldu
        //yukardaki ife direcek ve yeni girilen değerler artık alınabilecek
    }




}
