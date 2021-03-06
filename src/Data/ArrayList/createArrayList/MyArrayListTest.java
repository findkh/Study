package Data.ArrayList.createArrayList;

public class MyArrayListTest {

  /*
   테스트1 - MyArrayListTest 
   1) 인스턴스/객체 (의 주소)를 담을 레퍼런스 배열을 준비한다. 
   2) 인스턴스를 추가하는 add(Object) 메서드 정의한다. 
   3) 특정 인덱스의 인스턴스를 리턴하는 get(int) 메서드 정의한다. 
   4) 인스턴스를 특정 위치에 삽입하는 add(int,Object) 메서드 정의한다. 
   5) 특정 위치의 항목을 다른 인스턴스로 교체하는 set(int,Object) 메서드를 정의한다. 
   6) 특정 위치의 항목을 제거하는 remove(int) 메서드를 정의한다.
   */

  public static void main(String[] args) {
    MyArrayList.add("aaa"); // aaa
    MyArrayList.add("bbb"); // aaa,bbb
    MyArrayList.add("ccc"); // aaa,bbb,ccc
    print();

    MyArrayList.add(1, "xxx"); // aaa,xxx,bbb,ccc
    print();

    Object old = MyArrayList.set(2, "yyy"); // aaa,xxx,yyy,ccc
    print();
    System.out.println(old);

    old = MyArrayList.remove(1);
    print();
    System.out.println(old);
  }

  static void print() {
    for (int i = 0; i < MyArrayList.size; i++) {
      String str = (String) MyArrayList.get(i);
      System.out.print(str + ",");
    }
    System.out.println();
  }
}
