package com.ctrip.xpipe.redis.meta.server;

import com.ctrip.xpipe.redis.meta.server.cluster.ClusterServerShardingTest;
import com.ctrip.xpipe.redis.meta.server.cluster.ClusterServersApiTest;
import com.ctrip.xpipe.redis.meta.server.cluster.impl.*;
import com.ctrip.xpipe.redis.meta.server.crdt.PeerMasterMetaServerStateChangeHandlerTest;
import com.ctrip.xpipe.redis.meta.server.crdt.manage.impl.DefaultPeerMasterStateAdjusterTest;
import com.ctrip.xpipe.redis.meta.server.crdt.manage.impl.DefaultPeerMasterAdjusterManagerTest;
import com.ctrip.xpipe.redis.meta.server.crdt.peermaster.impl.DefaultPeerMasterChooseCommandTest;
import com.ctrip.xpipe.redis.meta.server.crdt.peermaster.impl.DefaultPeerMasterChooserTest;
import com.ctrip.xpipe.redis.meta.server.crdt.peermaster.impl.DefaultPeerMasterChooserManagerTest;
import com.ctrip.xpipe.redis.meta.server.crdt.peermaster.impl.RemoteDcPeerMasterChooseCommandTest;
import com.ctrip.xpipe.redis.meta.server.dcchange.DefaultChangePrimaryDcActionTest;
import com.ctrip.xpipe.redis.meta.server.dchange.impl.AtLeastOneCheckerTest;
import com.ctrip.xpipe.redis.meta.server.dchange.impl.DefaultOffsetwaiterTest;
import com.ctrip.xpipe.redis.meta.server.dchange.impl.DefaultSentinelManagerTest;
import com.ctrip.xpipe.redis.meta.server.dchange.impl.FirstNewMasterChooserTest;
import com.ctrip.xpipe.redis.meta.server.impl.DefaultMetaServersTest;
import com.ctrip.xpipe.redis.meta.server.job.DefaultSlaveOfJobTest;
import com.ctrip.xpipe.redis.meta.server.job.KeeperStateChangeJobTest;
import com.ctrip.xpipe.redis.meta.server.job.PeerMasterAdjustJobTest;
import com.ctrip.xpipe.redis.meta.server.keeper.DefaultKeeperStateChangeHandlerTest;
import com.ctrip.xpipe.redis.meta.server.keeper.container.DefaultKeeperContainerServiceFactoryTest;
import com.ctrip.xpipe.redis.meta.server.keeper.elect.DefaultKeeperActiveElectAlgorithmManagerTest;
import com.ctrip.xpipe.redis.meta.server.keeper.elect.DefaultKeeperElectorManagerTest;
import com.ctrip.xpipe.redis.meta.server.keeper.elect.UserDefinedPriorityKeeperActiveElectAlgorithmTest;
import com.ctrip.xpipe.redis.meta.server.keeper.keepermaster.impl.BackupDcKeeperMasterChooserAlgorithmTest;
import com.ctrip.xpipe.redis.meta.server.keeper.keepermaster.impl.DefaultDcKeeperMasterChooserTest;
import com.ctrip.xpipe.redis.meta.server.keeper.keepermaster.impl.PrimaryDcKeeperMasterChooserAlgorithmTest;
import com.ctrip.xpipe.redis.meta.server.keeper.manager.AddKeeperCommandTest;
import com.ctrip.xpipe.redis.meta.server.keeper.manager.DefaultKeeperManagerTest;
import com.ctrip.xpipe.redis.meta.server.keeper.manager.DefaultKeeperStateControllerTest;
import com.ctrip.xpipe.redis.meta.server.keeper.manager.DeleteKeeperCommandTest;
import com.ctrip.xpipe.redis.meta.server.meta.CurrentMetaTest;
import com.ctrip.xpipe.redis.meta.server.meta.MetaJacksonTest;
import com.ctrip.xpipe.redis.meta.server.meta.impl.DefaultCurrentMetaManagerTest;
import com.ctrip.xpipe.redis.meta.server.meta.impl.DefaultDcMetaCacheRefreshTest;
import com.ctrip.xpipe.redis.meta.server.meta.impl.DefaultDcMetaCacheTest;
import com.ctrip.xpipe.redis.meta.server.rest.ForwardInfoEditorTest;
import com.ctrip.xpipe.redis.meta.server.rest.ForwardInfoTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/**
 * @author wenchao.meng
 *
 * May 17, 2016 2:05:50 PM
 */
@RunWith(Suite.class)
@SuiteClasses({
	DefaultDcMetaCacheTest.class,
	MetaJacksonTest.class,
	ArrangeTaskTriggerTest.class,
	ArrangeTaskExecutorTest.class,
	DefaultClusterArrangerTest.class,
	DefaultClusterServersTest.class,
	ClusterServerShardingTest.class,
	ClusterServersApiTest.class,
	DefaultMetaServersTest.class,
	DefaultCurrentClusterServerTest.class,
	DefaultKeeperContainerServiceFactoryTest.class,
	ForwardInfoEditorTest.class,
	DefaultCurrentMetaManagerTest.class,
	ForwardInfoTest.class,
	AtLeastOneCheckerTest.class,
	CurrentMetaTest.class,
	UserDefinedPriorityKeeperActiveElectAlgorithmTest.class,
	DefaultKeeperActiveElectAlgorithmManagerTest.class,
	DefaultKeeperElectorManagerTest.class,
	AddKeeperCommandTest.class,
	DeleteKeeperCommandTest.class,
	BackupDcKeeperMasterChooserAlgorithmTest.class,
	PrimaryDcKeeperMasterChooserAlgorithmTest.class,
	DefaultDcKeeperMasterChooserTest.class,
	FirstNewMasterChooserTest.class,
	DefaultOffsetwaiterTest.class,
	DefaultSlaveOfJobTest.class,
	DefaultKeeperStateControllerTest.class,
	KeeperStateChangeJobTest.class,
	DefaultKeeperStateChangeHandlerTest.class,
	DeferredResponseTest.class,
	DefaultSentinelManagerTest.class,
	DefaultDcMetaCacheRefreshTest.class,
	DefaultChangePrimaryDcActionTest.class,
	DefaultKeeperManagerTest.class,
	DefaultPeerMasterChooserManagerTest.class,
	DefaultPeerMasterChooserTest.class,
	DefaultPeerMasterChooseCommandTest.class,
	RemoteDcPeerMasterChooseCommandTest.class,
	PeerMasterAdjustJobTest.class,
	DefaultPeerMasterStateAdjusterTest.class,
	DefaultPeerMasterAdjusterManagerTest.class,
	PeerMasterMetaServerStateChangeHandlerTest.class
})
public class AllTests {

}
