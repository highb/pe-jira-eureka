package ut.com.puppet.highb.tutorial;

import org.junit.Test;
import com.puppet.highb.tutorial.api.MyPluginComponent;
import com.puppet.highb.tutorial.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}