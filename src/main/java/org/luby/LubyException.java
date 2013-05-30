package main.java.org.luby;

/**
 * Created with IntelliJ IDEA.
 * User: Lucy
 * Date: 5/28/13
 * Time: 9:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class LubyException extends Exception {
  public LubyException(String msg) {
    super(msg);
  }

  public LubyException(String msg, Exception e) {
    super(msg, e);
  }

  public LubyException(Exception e) {
    super(e);
  }
}
