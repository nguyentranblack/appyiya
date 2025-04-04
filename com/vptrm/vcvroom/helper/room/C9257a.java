package com.vptrm.vcvroom.helper.room;

import ad.AbstractC0132f;
import af.AbstractC0189p;
import af.C0172e0;
import com.blankj.utilcode.util.AbstractC2595m;
import com.huawei.hms.api.FailedBinderCallBack;
import com.vptrm.common.entity.CallInfo;
import com.vptrm.common.entity.LiveConnectUserEntity;
import com.vptrm.common.entity.LoginEntity;
import com.vptrm.common.entity.UserInfo;
import com.vptrm.common.helper.C8923p;
import com.vptrm.common.utils.C9017t;
import com.vptrm.library.helper.C9072a;
import com.vptrm.vcvroom.app.C9166e;
import com.vptrm.vcvroom.entity.LiveConnectEventBust;
import com.vptrm.vcvroom.entity.LiveIntervalSecEntity;
import com.vptrm.vcvroom.entity.RoomInfoEntity;
import io.agora.rtc2.ChannelMediaOptions;
import io.agora.rtc2.RtcEngine;
import java.util.HashMap;
import kotlin.coroutines.InterfaceC14612d;
import kotlin.coroutines.intrinsics.C14630c;
import kotlin.jvm.internal.AbstractC14648g;
import kotlin.jvm.internal.AbstractC14656n;
import kotlinx.coroutines.AbstractC14805f0;
import kotlinx.coroutines.AbstractC14857h;
import kotlinx.coroutines.AbstractC14932o0;
import kotlinx.coroutines.C14980t0;
import kotlinx.coroutines.InterfaceC14801e0;
import kotlinx.coroutines.InterfaceC14919l1;
import p296df.AbstractC13346l;
import p397jf.InterfaceC14416p;
import p612xd.C17594b;

/* renamed from: com.vptrm.vcvroom.helper.room.a */
/* loaded from: classes3.dex */
public final class C9257a {

    /* renamed from: d */
    public static volatile C9257a f20282d;

    /* renamed from: a */
    public InterfaceC14919l1 f20284a;

    /* renamed from: b */
    public long f20285b = 3;

    /* renamed from: c */
    public static final C9258a f20281c = new C9258a(null);

    /* renamed from: e */
    public static final Object f20283e = new Object();

    /* renamed from: com.vptrm.vcvroom.helper.room.a$a */
    /* loaded from: classes3.dex */
    public static final class C9258a {
        public C9258a() {
        }

        /* renamed from: a */
        public final C9257a m20582a() {
            if (C9257a.f20282d == null) {
                synchronized (C9257a.f20283e) {
                    try {
                        if (C9257a.f20282d == null) {
                            C9257a.f20282d = new C9257a();
                        }
                        C0172e0 c0172e0 = C0172e0.f512a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            C9257a c9257a = C9257a.f20282d;
            AbstractC14656n.m8380d(c9257a);
            return c9257a;
        }

        public /* synthetic */ C9258a(AbstractC14648g abstractC14648g) {
            this();
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.room.a$b */
    /* loaded from: classes3.dex */
    public static final class C9259b extends AbstractC0132f {
        public C9259b() {
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(LiveIntervalSecEntity liveIntervalSecEntity) {
            long j;
            Long intervalSec;
            if (liveIntervalSecEntity != null && (intervalSec = liveIntervalSecEntity.getIntervalSec()) != null) {
                j = intervalSec.longValue();
            } else {
                j = 3;
            }
            if (j > 0) {
                C9257a.this.f20285b = j;
            }
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.room.a$c */
    /* loaded from: classes3.dex */
    public static final class C9260c extends AbstractC0132f {
        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }

        @Override // ad.AbstractC0132f
        public void onSuccess(Object obj) {
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.room.a$d */
    /* loaded from: classes3.dex */
    public static final class C9261d extends AbstractC13346l implements InterfaceC14416p {
        final /* synthetic */ long $callId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9261d(long j, InterfaceC14612d interfaceC14612d) {
            super(2, interfaceC14612d);
            this.$callId = j;
        }

        @Override // p296df.AbstractC13334a
        public final InterfaceC14612d create(Object obj, InterfaceC14612d interfaceC14612d) {
            C9261d c9261d = new C9261d(this.$callId, interfaceC14612d);
            c9261d.L$0 = obj;
            return c9261d;
        }

        @Override // p296df.AbstractC13334a
        public final Object invokeSuspend(Object obj) {
            InterfaceC14801e0 interfaceC14801e0;
            Object m8425c = C14630c.m8425c();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    interfaceC14801e0 = (InterfaceC14801e0) this.L$0;
                    AbstractC0189p.m38710b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0189p.m38710b(obj);
                interfaceC14801e0 = (InterfaceC14801e0) this.L$0;
            }
            while (AbstractC14805f0.m8053f(interfaceC14801e0)) {
                C9257a.this.m20591g(this.$callId);
                this.L$0 = interfaceC14801e0;
                this.label = 1;
                if (AbstractC14932o0.m7747a(C9257a.this.f20285b * 1000, this) == m8425c) {
                    return m8425c;
                }
            }
            return C0172e0.f512a;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // p397jf.InterfaceC14416p
        /* renamed from: invoke */
        public final Object mo39315invoke(InterfaceC14801e0 interfaceC14801e0, InterfaceC14612d interfaceC14612d) {
            return ((C9261d) create(interfaceC14801e0, interfaceC14612d)).invokeSuspend(C0172e0.f512a);
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.room.a$e */
    /* loaded from: classes3.dex */
    public static final class C9262e extends AbstractC0132f {
        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }

        @Override // ad.AbstractC0132f
        public void onSuccess(Object obj) {
        }
    }

    /* renamed from: g */
    public final void m20591g(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(FailedBinderCallBack.CALLER_ID, Long.valueOf(j));
        C17594b.m582p(hashMap).subscribe(new C9259b());
    }

    /* renamed from: h */
    public final void m20590h(int i, int i2) {
        int i3;
        boolean z;
        boolean z2 = false;
        if (i2 == 4 && !C9166e.f14400d0.m21050a().m21054y()) {
            RtcEngine m21558i = C9017t.f13980g.m21550a().m21558i();
            if (m21558i != null) {
                m21558i.adjustRecordingSignalVolume(300);
            }
        } else {
            RtcEngine m21558i2 = C9017t.f13980g.m21550a().m21558i();
            if (m21558i2 != null) {
                m21558i2.adjustRecordingSignalVolume(0);
            }
        }
        ChannelMediaOptions channelMediaOptions = new ChannelMediaOptions();
        if (i2 == 4) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        channelMediaOptions.clientRoleType = i3;
        channelMediaOptions.channelProfile = 1;
        if (i2 == 4) {
            z = true;
        } else {
            z = false;
        }
        channelMediaOptions.publishMicrophoneTrack = Boolean.valueOf(z);
        if (i2 == 4 && i == 1) {
            z2 = true;
        }
        channelMediaOptions.publishCameraTrack = Boolean.valueOf(z2);
        RtcEngine m21558i3 = C9017t.f13980g.m21550a().m21558i();
        if (m21558i3 != null) {
            m21558i3.updateChannelMediaOptions(channelMediaOptions);
        }
    }

    /* renamed from: i */
    public final void m20589i(long j, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("opType", Integer.valueOf(i));
        hashMap.put(FailedBinderCallBack.CALLER_ID, Long.valueOf(j));
        C17594b.m688T1(hashMap).subscribe(new C9260c());
    }

    /* renamed from: j */
    public final void m20588j(LiveConnectUserEntity liveConnectUserEntity) {
        long j;
        int i;
        long j2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j3;
        int i7;
        long j4;
        long j5;
        int i8;
        int i9;
        AbstractC14656n.m8377g(liveConnectUserEntity, "liveConnectUserEntity");
        LoginEntity m21787g = C8923p.m21789e().m21787g();
        CallInfo callInfo = liveConnectUserEntity.getCallInfo();
        Long opUserId = liveConnectUserEntity.getOpUserId();
        long j6 = 0;
        if (opUserId != null) {
            j = opUserId.longValue();
        } else {
            j = 0;
        }
        Integer opType = liveConnectUserEntity.getOpType();
        boolean z = true;
        if (opType != null) {
            i = opType.intValue();
        } else {
            i = 1;
        }
        int i10 = 2;
        if (i == 1 || i == 2) {
            C9072a.m21420c("KEY_LIVE_CONNECT_CLOSE_DIALOG", Boolean.TRUE);
        }
        int i11 = 0;
        if (i == 5) {
            C9166e.C9167a c9167a = C9166e.f14400d0;
            c9167a.m21050a().m21078m().clear();
            c9167a.m21050a().m21051z0(false);
        }
        C9072a.m21420c("KEY_LIVE_CONNECT_REFRESH_LIST", Boolean.TRUE);
        if (callInfo != null) {
            Integer callType = callInfo.getCallType();
            if (callType != null) {
                i6 = callType.intValue();
            } else {
                i6 = 2;
            }
            Long id2 = callInfo.getId();
            if (id2 != null) {
                j3 = id2.longValue();
            } else {
                j3 = 0;
            }
            Integer inviteCountdownSec = callInfo.getInviteCountdownSec();
            if (inviteCountdownSec != null) {
                i7 = inviteCountdownSec.intValue();
            } else {
                i7 = 0;
            }
            Long userId = callInfo.getUserId();
            if (userId != null) {
                j4 = userId.longValue();
            } else {
                j4 = 0;
            }
            Long anchorUserId = callInfo.getAnchorUserId();
            if (anchorUserId != null) {
                j5 = anchorUserId.longValue();
            } else {
                j5 = 0;
            }
            int i12 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i12 > 0 && j == j4) {
                i8 = 1;
            } else {
                i8 = 0;
            }
            if (i12 <= 0 || j != j5) {
                i10 = i8;
            }
            if (m21787g.getId() != j4 && m21787g.getId() != j5) {
                z = false;
            } else {
                C9166e m21050a = C9166e.f14400d0.m21050a();
                if (i != 0 && i != 4) {
                    i9 = -1;
                } else {
                    i9 = i;
                }
                m21050a.m21159B0(i9);
            }
            i4 = i10;
            i2 = i6;
            j2 = j3;
            i3 = i7;
        } else {
            j2 = 0;
            i2 = 2;
            z = false;
            i3 = 0;
            i4 = 0;
        }
        UserInfo userInfo = liveConnectUserEntity.getUserInfo();
        if (userInfo != null) {
            Long userId2 = userInfo.getUserId();
            if (userId2 != null) {
                j6 = userId2.longValue();
            }
            Integer userNumber = userInfo.getUserNumber();
            if (userNumber != null) {
                i11 = userNumber.intValue();
            }
            String icon = userInfo.getIcon();
            String nickname = userInfo.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            String str = nickname;
            if (z) {
                C9166e.f14400d0.m21050a().m21157C0(str);
            }
            if (m21787g.getId() == j6) {
                i5 = 4;
                LiveConnectEventBust liveConnectEventBust = new LiveConnectEventBust(str, Integer.valueOf(i11), true, i2, i, icon, j2, i3, i4, z);
                C9166e.f14400d0.m21050a().m21053y0(liveConnectEventBust);
                C9072a.m21420c("KEY_LIVE_CONNECT", liveConnectEventBust);
                m20590h(i2, i);
            } else {
                i5 = 4;
                LiveConnectEventBust liveConnectEventBust2 = new LiveConnectEventBust(str, Integer.valueOf(i11), false, i2, i, icon, j2, i3, i4, z);
                C9166e.f14400d0.m21050a().m21053y0(liveConnectEventBust2);
                C9072a.m21420c("KEY_LIVE_CONNECT", liveConnectEventBust2);
            }
        } else {
            i5 = 4;
        }
        if (i == i5 && z) {
            m20585m(j2);
        } else {
            m20584n();
        }
    }

    /* renamed from: k */
    public final void m20587k(String json) {
        AbstractC14656n.m8377g(json, "json");
        LoginEntity m21787g = C8923p.m21789e().m21787g();
        C9166e.C9167a c9167a = C9166e.f14400d0;
        RoomInfoEntity m21156D = c9167a.m21050a().m21156D();
        if (m21787g != null && m21156D != null) {
            LiveConnectUserEntity liveConnectUserEntity = (LiveConnectUserEntity) AbstractC2595m.m36176d(json, LiveConnectUserEntity.class);
            if (liveConnectUserEntity != null) {
                m20588j(liveConnectUserEntity);
                return;
            } else {
                c9167a.m21050a().m21159B0(-1);
                return;
            }
        }
        c9167a.m21050a().m21159B0(-1);
    }

    /* renamed from: l */
    public final void m20586l(String json) {
        LiveConnectUserEntity liveConnectUserEntity;
        CallInfo callInfo;
        int i;
        long j;
        int i2;
        AbstractC14656n.m8377g(json, "json");
        LoginEntity m21787g = C8923p.m21789e().m21787g();
        if (m21787g != null && (liveConnectUserEntity = (LiveConnectUserEntity) AbstractC2595m.m36176d(json, LiveConnectUserEntity.class)) != null && (callInfo = liveConnectUserEntity.getCallInfo()) != null) {
            Integer callType = callInfo.getCallType();
            if (callType != null) {
                i = callType.intValue();
            } else {
                i = 2;
            }
            Long userId = callInfo.getUserId();
            if (userId != null) {
                j = userId.longValue();
            } else {
                j = 0;
            }
            Integer status = callInfo.getStatus();
            if (status != null) {
                i2 = status.intValue();
            } else {
                i2 = 1;
            }
            LiveConnectEventBust m21056x = C9166e.f14400d0.m21050a().m21056x();
            if (m21056x != null) {
                m21056x.setCallType(i);
            }
            C9072a.m21420c("KEY_LIVE_SWITCH_CONNECT", Integer.valueOf(i));
            if (m21787g.getId() == j) {
                m20590h(i, i2);
            }
        }
    }

    /* renamed from: m */
    public final synchronized void m20585m(long j) {
        InterfaceC14919l1 m7942d;
        try {
            InterfaceC14919l1 interfaceC14919l1 = this.f20284a;
            if (interfaceC14919l1 != null) {
                InterfaceC14919l1.C14920a.m7759a(interfaceC14919l1, null, 1, null);
            }
            m7942d = AbstractC14857h.m7942d(AbstractC14805f0.m8058a(C14980t0.m7560c()), null, null, new C9261d(j, null), 3, null);
            this.f20284a = m7942d;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: n */
    public final void m20584n() {
        InterfaceC14919l1 interfaceC14919l1 = this.f20284a;
        if (interfaceC14919l1 != null) {
            InterfaceC14919l1.C14920a.m7759a(interfaceC14919l1, null, 1, null);
        }
    }

    /* renamed from: o */
    public final void m20583o(int i, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("callType", Integer.valueOf(i));
        hashMap.put(FailedBinderCallBack.CALLER_ID, Long.valueOf(j));
        C17594b.m578p3(hashMap).subscribe(new C9262e());
    }
}
