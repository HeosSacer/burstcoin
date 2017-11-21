/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Nov 21 21:32:53 GMT 2017
 */

package brs;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BurstException_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "brs.BurstException"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "Europe/Berlin"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BurstException_ESTest_scaffolding.class.getClassLoader() ,
      "brs.Attachment",
      "brs.TransactionType",
      "brs.BlockImpl",
      "brs.Generator$Event",
      "brs.db.BurstKey",
      "brs.peer.Peer",
      "brs.util.Listener",
      "brs.Blockchain",
      "org.json.simple.JSONStreamAware",
      "org.json.simple.JSONAware",
      "brs.BurstException$StopException",
      "brs.Burst",
      "brs.Appendix$AbstractEncryptedMessage",
      "brs.TransactionProcessor",
      "brs.BurstException$NotCurrentlyValidException",
      "brs.util.Observable",
      "brs.BlockchainProcessor$BlockOutOfOrderException",
      "brs.Generator",
      "brs.Appendix$Message",
      "brs.Block",
      "brs.Generator$GeneratorState",
      "brs.BlockchainProcessor",
      "brs.BlockchainProcessor$TransactionNotAcceptedException",
      "brs.Appendix$EncryptToSelfMessage",
      "brs.db.store.Dbs",
      "brs.Appendix$AbstractAppendix",
      "brs.util.ThreadPool$2",
      "brs.util.ThreadPool$1",
      "brs.util.Time",
      "brs.Transaction",
      "brs.BurstException$NotYetEnabledException",
      "brs.GeneratorImpl",
      "brs.BurstException$ValidationException",
      "brs.Appendix$EncryptedMessage",
      "brs.db.store.Stores",
      "brs.BurstException$NotValidException",
      "brs.Appendix$PublicKeyAnnouncement",
      "org.json.simple.JSONObject",
      "brs.util.ThreadPool",
      "brs.BurstException",
      "brs.BlockchainProcessor$BlockNotAcceptedException",
      "brs.TransactionImpl",
      "brs.util.Convert",
      "brs.Appendix"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BurstException_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "brs.BurstException",
      "brs.TransactionImpl",
      "brs.util.Convert",
      "brs.BurstException$StopException",
      "brs.BlockchainProcessor$BlockNotAcceptedException",
      "brs.BlockchainProcessor$BlockOutOfOrderException",
      "brs.BurstException$ValidationException",
      "brs.BurstException$NotCurrentlyValidException",
      "brs.BurstException$NotValidException",
      "org.json.simple.JSONObject",
      "brs.BurstException$NotYetEnabledException",
      "brs.BlockchainProcessor$TransactionNotAcceptedException",
      "brs.BlockImpl",
      "brs.util.ThreadPool",
      "brs.GeneratorImpl",
      "brs.Burst"
    );
  }
}