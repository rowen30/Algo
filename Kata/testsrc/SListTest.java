import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sumit on 21/5/17.
 */
public class SListTest<T> {
    private SList<T> sList;
    private SList.Node current;

    @Before
    public void setUp(){
        sList = new SList();
        current = new SList.Node();
    }

    @Test
    public void emptyList()
    {
       current.element = "";
       Assert.assertEquals("",sList.get(current));
    }

    @Test
    public void getOneElement()
    {
        current.element = "One";
        Assert.assertEquals("One",sList.get(current));
    }

}
