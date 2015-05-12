package com.automateddocsys.pma.pmaclientdata;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.automateddocsys.pma.pmaclientdata.config.DataConfiguration;
import com.automateddocsys.pma.pmaclientdata.model.Clientname;
import com.automateddocsys.pma.pmaclientdata.repository.ClientnameRepository;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={DataConfiguration.class})
public class AppTest 
{
	
	@Autowired
	ClientnameRepository clientnameRepository;
    /**
     * Rigourous Test :-)
     */
	@Test
    public void testApp()
    {
        Assert.assertTrue( true );
        List<Clientname> lst = clientnameRepository.findAll();
        for (Clientname clientname : lst) {
        	if (clientname.getPassword() != null) {
        		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        	}
			System.out.println(clientname + " Password: " + clientname.getPassword());
		}
    }
}
