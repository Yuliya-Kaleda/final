package strq;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleStringQueue implements StringQueue {
  private Queue<Character> chars;

  public SimpleStringQueue() {
    chars = new LinkedList<Character>();
  }

  @Override
  public int length() {
    return chars.size();
  }

  @Override
  public void enqueue(String string) {
    for (int i = 0; i < string.length(); i++) {
      chars.add(string.charAt(i));
    }
    System.out.println("added: " + chars);
  }

  @Override
  public String dequeue(int length) {
    StringBuilder removed = new StringBuilder();
    for (int i = 0; i < length; i++) {
      removed.append(chars.element());
      chars.remove();
    }
    System.out.println("removed: " + chars);
    return removed.toString();
  }
}
