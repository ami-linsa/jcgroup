package me.haosdent.cgroup.util;

import me.haosdent.cgroup.manage.Admin;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import static org.junit.Assert.*;

public class ShellTest {

  private static final Logger LOG = LoggerFactory.getLogger(ShellTest.class);

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  @Test
  public void testExec() {
    try {
      Admin admin = new Admin(Constants.SUBSYS_CPU);
      Shell shell = admin.getShell();
      String output = shell.exec("echo 0");
      assertTrue(output.equals("0\n"));
    } catch (IOException e) {
      LOG.error("Error", e);
      assertTrue(false);
    }
  }
}
