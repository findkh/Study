package Data.LinkedList.createLinkedList;

import java.lang.reflect.Array;
//1. LinkedList 클래스 정의
//3. 첫번째 노드와 마지막 노드의 주소를 담을 필드를 추가한다.
//10. 인스턴스 필드에 대해 캡슐화를 적용한다.
//11. 제네릭을 적용한다.
//13. Object.clone()을 오버라이딩: shallow copy
public class LinkedList05<E> implements Cloneable {

  private Node<E> first; //값을 찾을 때는 첫 번째 노드부터 따라간다.
  private Node<E> last; //값을 추가할 때는 마지막 노드에 연결한다.
  private int size; //목록 크기를 보관한다.

  static class Node<E> {
    /*2. 값을 담을 노드 클래스를 설계한다.
    Node 클래스는 목록에서 각 항목의 값을 보관하는 객체로 역할을 수행한다.
    스태틱 클래스
     -> 여러 개의 LinkedList 객체가 공유하는 클래스이므로 스태틱으로 Node 클래스를 설계한다.
     */
    E value;
    Node<E> next;

    public Node() {}

    public Node(E value) {
      this.value = value;
    }
  }

  //4. 목록에 값을 추가하는 add() 메서드를 정의한다.
  public boolean add(E e) {
    Node<E> node = new Node();
    node.value = e;

    if (first == null) {
      first = node;
    } else {
      last.next = node;
    }
    last = node;
    size++;

    return true;
  }

  //5. 목록에서 값을 조회하는 get() 메서드를 정의한다.
  public E get(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    Node<E> cursor = this.first;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }

  //6. 목록에서 특정 인덱스 위치에 값을 삽입하는 add(int, Object) 메서드를 정의한다.
  //- Node의 생성자를 추가한다.
  public void add(int index, Object element) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    Node<E> node = new Node(element);

    size++;

    if (index == 0) {
      node.next = first;
      first = node;
      return;
    }

    Node<E> cursor = this.first;
    for (int i = 1; i <= index -1; i++) {
      cursor = cursor.next;
    }

    node.next = cursor.next;
    cursor.next = node;

    if (node.next == null) {
      last = node;
    }
  }

  //7. 목록에서 특정 인덱스에 값을 제거하는 remove(int) 메서드를 정의한다.
  public E remove(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    size--;

    if(index == 0) {
      Node<E> old = first;
      first = old.next;
      old.next = null; //가비지가 다른 인스턴스를 가리키지 않게 한다.
      return old.value;
    }

    Node<E> cursor = this.first;
    for (int i = 1; i <= index -1; i++) {
      cursor = cursor.next;
    }

    Node<E> old = cursor.next;
    cursor.next = old.next;
    old.next = null; //가비지가 다른 인스턴스를 가리키지 않게 한다.

    if (cursor.next == null) {
      last = cursor;
    }
    return old.value;
  }

  //8. 목록에서 특정 인덱스의 값을 바꾸는 set(int, Object) 메서드를 정의한다.
  public E set(int index, E element) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    Node<E> cursor = this.first;
    for(int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }

    E old = cursor.value;
    cursor.value = element;

    return old;
  }

  //9. 목록의 데이터를 새 배열에 담아 리턴하는 toArray() 메서드를 정의한다.
  public Object[] toArray() {
    Object[] arr = new Object[this.size];

    int i = 0;
    Node<E> cursor = first;

    while(cursor != null) {
      arr[i++] = cursor.value;
      cursor = cursor.next;
    }
    return arr;
  }

  //10. 목록 크기를 리턴하는 size()를 추가로 정의한다.
  public int size() {
    return this.size;
  }

  //12. 파라미터로 받은 배열에 값을 채워주는 toArray(E[]) 메서드를 추가한다.
  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {
    if (arr.length < size) {
      Class<?> arrayClassInfo = arr.getClass();
      Class<?> arrayItemClassInfo = arrayClassInfo.getComponentType();

      arr = (E[]) Array.newInstance(arrayItemClassInfo, this.size);
    }

    Node<E> cursor = first;
    for(int i = 0; i <size; i++) {
      arr[i] = cursor.value;
      cursor = cursor.next;
    }
    return arr;
  }

  //  14) Object.clone()을 오버라이딩: deep copy
  /* Object.clone()을 오버라이딩 할 때 'deep copy' 이용하여 스택 객체 복사하기
      => 새 연결 리스트를 만들어 원본에 보관된 값을 복사한다.
      => 따라서 복사본의 Node 객체는 원본의 Node 객체와 다르다. 
      복사본의 상태 변경에 원본은 영향 받지 않는다.
   */
  @SuppressWarnings("unchecked")
  @Override
  public LinkedList05<E> clone() throws CloneNotSupportedException {
    LinkedList05<E> newList = new LinkedList05<>();
    Object[] values = this.toArray();
    for (Object value : values) {
      newList.add((E) value);
    }
    return newList;
  }
}
