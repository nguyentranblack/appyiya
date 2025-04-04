package com.vptrm.vcvroom.helper.room;

import ad.AbstractC0132f;
import af.C0172e0;
import com.blankj.utilcode.util.C2564c0;
import com.vptrm.common.entity.LoginEntity;
import com.vptrm.common.helper.C8923p;
import com.vptrm.common.utils.C9017t;
import com.vptrm.library.helper.C9072a;
import com.vptrm.vcvroom.app.C9166e;
import com.vptrm.vcvroom.entity.RoomInfoEntity;
import com.vptrm.vcvroom.entity.room.RoomPkInfoEntity;
import com.vptrm.vcvroom.entity.room.RoomUserPk;
import io.agora.rtc2.RtcEngine;
import io.agora.rtc2.video.ChannelMediaInfo;
import io.agora.rtc2.video.ChannelMediaRelayConfiguration;
import java.io.PrintStream;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC14648g;
import kotlin.jvm.internal.AbstractC14656n;
import p413kd.InterfaceC14536b;
import p612xd.C17594b;

/* renamed from: com.vptrm.vcvroom.helper.room.d */
/* loaded from: classes3.dex */
public final class C9272d {

    /* renamed from: b */
    public static volatile C9272d f20299b;

    /* renamed from: a */
    public static final C9273a f20298a = new C9273a(null);

    /* renamed from: c */
    public static final Object f20300c = new Object();

    /* renamed from: com.vptrm.vcvroom.helper.room.d$a */
    /* loaded from: classes3.dex */
    public static final class C9273a {
        public C9273a() {
        }

        /* renamed from: a */
        public final C9272d m20545a() {
            if (C9272d.f20299b == null) {
                synchronized (C9272d.f20300c) {
                    try {
                        if (C9272d.f20299b == null) {
                            C9272d.f20299b = new C9272d();
                        }
                        C0172e0 c0172e0 = C0172e0.f512a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            C9272d c9272d = C9272d.f20299b;
            AbstractC14656n.m8380d(c9272d);
            return c9272d;
        }

        public /* synthetic */ C9273a(AbstractC14648g abstractC14648g) {
            this();
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.room.d$b */
    /* loaded from: classes3.dex */
    public static final class C9274b extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f20301a;

        public C9274b(InterfaceC14536b interfaceC14536b) {
            this.f20301a = interfaceC14536b;
        }

        @Override // ad.AbstractC0132f
        public void onFail(String str, String str2) {
            InterfaceC14536b interfaceC14536b = this.f20301a;
            if (interfaceC14536b != null) {
                interfaceC14536b.onSuccess(Boolean.TRUE);
            }
        }

        @Override // ad.AbstractC0132f
        public void onSuccess(Object obj) {
            C2564c0.m36298b().m36280t("isOpenPkSwitch", false);
            InterfaceC14536b interfaceC14536b = this.f20301a;
            if (interfaceC14536b != null) {
                interfaceC14536b.onSuccess(Boolean.TRUE);
            }
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.room.d$c */
    /* loaded from: classes3.dex */
    public static final class C9275c extends AbstractC0132f {
        /* JADX DEBUG: Method merged with bridge method */
        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            boolean z;
            C2564c0 m36298b = C2564c0.m36298b();
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            m36298b.m36280t("isOpenPkSwitch", z);
        }

        @Override // ad.AbstractC0132f
        public void onFail(String str, String str2) {
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.room.d$d */
    /* loaded from: classes3.dex */
    public static final class C9276d extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f20302a;

        public C9276d(InterfaceC14536b interfaceC14536b) {
            this.f20302a = interfaceC14536b;
        }

        @Override // ad.AbstractC0132f
        public void onFail(String str, String str2) {
            InterfaceC14536b interfaceC14536b = this.f20302a;
            if (interfaceC14536b != null) {
                interfaceC14536b.onSuccess(Boolean.FALSE);
            }
        }

        @Override // ad.AbstractC0132f
        public void onSuccess(Object obj) {
            C2564c0.m36298b().m36280t("isOpenPkSwitch", true);
            InterfaceC14536b interfaceC14536b = this.f20302a;
            if (interfaceC14536b != null) {
                interfaceC14536b.onSuccess(Boolean.TRUE);
            }
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.room.d$e */
    /* loaded from: classes3.dex */
    public static final class C9277e extends AbstractC0132f {
        public C9277e() {
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(RoomPkInfoEntity roomPkInfoEntity) {
            int i;
            Integer opType;
            C9166e.C9167a c9167a = C9166e.f14400d0;
            if (c9167a.m21050a().m21156D() != null) {
                c9167a.m21050a().m21115X0(roomPkInfoEntity);
            }
            if (roomPkInfoEntity != null && (opType = roomPkInfoEntity.getOpType()) != null) {
                i = opType.intValue();
            } else {
                i = -1;
            }
            if (roomPkInfoEntity == null || i != 3) {
                C9272d.this.m20546k();
            }
            if (roomPkInfoEntity == null) {
                c9167a.m21050a().m21115X0(null);
            }
            C9072a.m21420c("KEY_ROOM_PK_ENTITY", roomPkInfoEntity);
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }
    }

    /* renamed from: d */
    public final void m20553d(InterfaceC14536b interfaceC14536b) {
        C17594b.m587o(new HashMap()).subscribe(new C9274b(interfaceC14536b));
    }

    /* renamed from: e */
    public final void m20552e() {
        C17594b.m550v1(new HashMap()).subscribe(new C9275c());
    }

    /* renamed from: f */
    public final boolean m20551f() {
        int i;
        Integer opType;
        C9166e.C9167a c9167a = C9166e.f14400d0;
        RoomPkInfoEntity m21120V = c9167a.m21050a().m21120V();
        if (m21120V != null && (opType = m21120V.getOpType()) != null) {
            i = opType.intValue();
        } else {
            i = -1;
        }
        PrintStream printStream = System.out;
        printStream.println((Object) ("===是否有PK====opType====" + i));
        printStream.println((Object) ("===是否有PK====AvRoomDataManager.get().roomPkInfoEntity====" + c9167a.m21050a().m21120V()));
        if (i != 0 && i != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void m20550g(String str, boolean z, String str2, String str3, int i, String str4) {
        ChannelMediaInfo channelMediaInfo = new ChannelMediaInfo(str2, str4, 0);
        ChannelMediaRelayConfiguration channelMediaRelayConfiguration = new ChannelMediaRelayConfiguration();
        channelMediaRelayConfiguration.setSrcChannelInfo(channelMediaInfo);
        channelMediaRelayConfiguration.setDestChannelInfo(str3, new ChannelMediaInfo(str3, str, i));
        RtcEngine m21558i = C9017t.f13980g.m21550a().m21558i();
        if (m21558i != null) {
            m21558i.startOrUpdateChannelMediaRelay(channelMediaRelayConfiguration);
        }
        PrintStream printStream = System.out;
        printStream.println((Object) ("=====加入声网==PK==agoraToken====" + str4));
        printStream.println((Object) ("=====加入声网==PK==token====" + str));
        printStream.println((Object) ("=====加入声网==PK==isAnchor====" + z));
        printStream.println((Object) ("=====加入声网==PK==channelId====" + str2));
        printStream.println((Object) ("=====加入声网==PK==toChannelId====" + str3));
        printStream.println((Object) ("=====加入声网==PK==uid====" + i));
    }

    /* renamed from: h */
    public final void m20549h(InterfaceC14536b interfaceC14536b) {
        C17594b.m698R1(new HashMap()).subscribe(new C9276d(interfaceC14536b));
    }

    /* renamed from: i */
    public final void m20548i() {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        Long userId;
        Long toUserId;
        C9166e.C9167a c9167a = C9166e.f14400d0;
        RoomInfoEntity m21156D = c9167a.m21050a().m21156D();
        RoomPkInfoEntity m21120V = c9167a.m21050a().m21120V();
        LoginEntity m21787g = C8923p.m21789e().m21787g();
        if (m21787g != null && m21156D != null && m21120V != null) {
            Integer opType = m21120V.getOpType();
            RoomUserPk roomUserPk = m21120V.getRoomUserPk();
            if (roomUserPk != null) {
                String roomCode = roomUserPk.getRoomCode();
                String str5 = "";
                if (roomCode == null) {
                    str = "";
                } else {
                    str = roomCode;
                }
                String toRoomCode = roomUserPk.getToRoomCode();
                if (toRoomCode == null) {
                    toRoomCode = "";
                }
                String agoraToken = roomUserPk.getAgoraToken();
                if (agoraToken == null) {
                    str2 = "";
                } else {
                    str2 = agoraToken;
                }
                String toAgoraToken = roomUserPk.getToAgoraToken();
                if (toAgoraToken == null) {
                    str3 = "";
                } else {
                    str3 = toAgoraToken;
                }
                String sourceAgoraToken = roomUserPk.getSourceAgoraToken();
                if (sourceAgoraToken == null) {
                    str4 = "";
                } else {
                    str4 = sourceAgoraToken;
                }
                String toSourceAgoraToken = roomUserPk.getToSourceAgoraToken();
                if (toSourceAgoraToken != null) {
                    str5 = toSourceAgoraToken;
                }
                if (opType != null && opType.intValue() == 3) {
                    long id2 = m21787g.getId();
                    Long userId2 = roomUserPk.getUserId();
                    if (userId2 == null || id2 != userId2.longValue()) {
                        long id3 = m21787g.getId();
                        Long toUserId2 = roomUserPk.getToUserId();
                        if (toUserId2 == null || id3 != toUserId2.longValue()) {
                            z = false;
                            long id4 = m21787g.getId();
                            userId = roomUserPk.getUserId();
                            if (userId != null && id4 == userId.longValue()) {
                                m20550g(str2, z, str, toRoomCode, m21787g.getUserNumber(), str4);
                                return;
                            }
                            long id5 = m21787g.getId();
                            toUserId = roomUserPk.getToUserId();
                            if (toUserId != null && id5 == toUserId.longValue()) {
                                m20550g(str3, z, toRoomCode, str, m21787g.getUserNumber(), str5);
                            }
                            return;
                        }
                    }
                    z = true;
                    long id42 = m21787g.getId();
                    userId = roomUserPk.getUserId();
                    if (userId != null) {
                        m20550g(str2, z, str, toRoomCode, m21787g.getUserNumber(), str4);
                        return;
                    }
                    long id52 = m21787g.getId();
                    toUserId = roomUserPk.getToUserId();
                    if (toUserId != null) {
                        m20550g(str3, z, toRoomCode, str, m21787g.getUserNumber(), str5);
                    }
                } else if (opType != null && opType.intValue() == 4) {
                    m20546k();
                }
            }
        }
    }

    /* renamed from: j */
    public final void m20547j(long j, InterfaceC14536b interfaceC14536b) {
        HashMap hashMap = new HashMap();
        hashMap.put("roomId", Long.valueOf(j));
        C17594b.m539x2(hashMap).subscribe(new C9277e());
    }

    /* renamed from: k */
    public final void m20546k() {
        C9017t.C9019b c9019b = C9017t.f13980g;
        RtcEngine m21558i = c9019b.m21550a().m21558i();
        if (m21558i != null) {
            m21558i.pauseAllChannelMediaRelay();
        }
        RtcEngine m21558i2 = c9019b.m21550a().m21558i();
        if (m21558i2 != null) {
            m21558i2.stopChannelMediaRelay();
        }
    }
}
