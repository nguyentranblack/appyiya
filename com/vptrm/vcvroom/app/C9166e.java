package com.vptrm.vcvroom.app;

import ad.AbstractC0132f;
import ad.C0127c;
import af.C0172e0;
import android.content.Context;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.blankj.utilcode.util.AbstractC2571f0;
import com.blankj.utilcode.util.AbstractC2603r;
import com.netease.nimlib.sdk.NIMClient;
import com.netease.nimlib.sdk.RequestCallback;
import com.netease.nimlib.sdk.StatusCode;
import com.netease.nimlib.sdk.chatroom.ChatRoomService;
import com.netease.nimlib.sdk.chatroom.model.EnterChatRoomData;
import com.netease.nimlib.sdk.chatroom.model.EnterChatRoomResultData;
import com.vptrm.common.entity.EnterEffAniToastEntity;
import com.vptrm.common.entity.MyVideoChatRoomEntity;
import com.vptrm.common.entity.UserEntity;
import com.vptrm.common.entity.VptMusicEntity;
import com.vptrm.common.utils.C8973b0;
import com.vptrm.common.utils.C9017t;
import com.vptrm.library.helper.C9072a;
import com.vptrm.vcvroom.entity.LiveConnectEventBust;
import com.vptrm.vcvroom.entity.MinimizeEventEntity;
import com.vptrm.vcvroom.entity.RoomInfoEntity;
import com.vptrm.vcvroom.entity.SwitchPlayEntity;
import com.vptrm.vcvroom.entity.room.RoomPkInfoEntity;
import com.vptrm.vcvroom.netease.C9302b;
import io.agora.rtc2.ClientRoleOptions;
import io.agora.rtc2.RtcEngine;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C14596u;
import kotlin.jvm.internal.AbstractC14648g;
import kotlin.jvm.internal.AbstractC14656n;
import kotlin.jvm.internal.AbstractC14657o;
import kotlin.text.C14721u;
import p397jf.InterfaceC14412l;
import p413kd.InterfaceC14536b;
import p435m4.C15166b;
import p490pd.C15916b;
import p612xd.C17594b;

/* renamed from: com.vptrm.vcvroom.app.e */
/* loaded from: classes3.dex */
public final class C9166e {

    /* renamed from: e0 */
    public static volatile C9166e f14401e0;

    /* renamed from: B */
    public volatile boolean f14404B;

    /* renamed from: C */
    public volatile boolean f14405C;

    /* renamed from: D */
    public boolean f14406D;

    /* renamed from: H */
    public volatile boolean f14410H;

    /* renamed from: L */
    public volatile boolean f14414L;

    /* renamed from: N */
    public volatile boolean f14416N;

    /* renamed from: O */
    public volatile MinimizeEventEntity f14417O;

    /* renamed from: P */
    public volatile LiveConnectEventBust f14418P;

    /* renamed from: Q */
    public volatile boolean f14419Q;

    /* renamed from: T */
    public volatile boolean f14422T;

    /* renamed from: Y */
    public volatile VptMusicEntity f14427Y;

    /* renamed from: Z */
    public volatile VptMusicEntity f14428Z;

    /* renamed from: a */
    public volatile MyVideoChatRoomEntity f14429a;

    /* renamed from: b */
    public volatile RoomInfoEntity f14431b;

    /* renamed from: c */
    public volatile long f14433c;

    /* renamed from: c0 */
    public Disposable f14434c0;

    /* renamed from: e */
    public volatile C15166b f14436e;

    /* renamed from: g */
    public volatile RoomPkInfoEntity f14438g;

    /* renamed from: j */
    public volatile boolean f14441j;

    /* renamed from: k */
    public volatile boolean f14442k;

    /* renamed from: m */
    public volatile boolean f14444m;

    /* renamed from: n */
    public volatile int f14445n;

    /* renamed from: t */
    public volatile int f14451t;

    /* renamed from: u */
    public volatile boolean f14452u;

    /* renamed from: x */
    public volatile UserEntity f14455x;

    /* renamed from: d0 */
    public static final C9167a f14400d0 = new C9167a(null);

    /* renamed from: f0 */
    public static final Object f14402f0 = new Object();

    /* renamed from: d */
    public volatile ArrayList f14435d = new ArrayList();

    /* renamed from: f */
    public volatile Integer f14437f = -1;

    /* renamed from: h */
    public volatile ArrayList f14439h = new ArrayList();

    /* renamed from: i */
    public volatile ArrayList f14440i = new ArrayList();

    /* renamed from: l */
    public volatile List f14443l = new ArrayList();

    /* renamed from: o */
    public volatile int f14446o = 1;

    /* renamed from: p */
    public volatile long f14447p = -1;

    /* renamed from: q */
    public volatile int f14448q = -1;

    /* renamed from: r */
    public volatile int f14449r = -1;

    /* renamed from: s */
    public volatile String f14450s = "";

    /* renamed from: v */
    public volatile int f14453v = -1;

    /* renamed from: w */
    public volatile int f14454w = -1;

    /* renamed from: y */
    public volatile String f14456y = "";

    /* renamed from: z */
    public volatile long f14457z = -1;

    /* renamed from: A */
    public volatile ArrayList f14403A = new ArrayList();

    /* renamed from: E */
    public volatile ArrayList f14407E = new ArrayList();

    /* renamed from: F */
    public volatile boolean f14408F = true;

    /* renamed from: G */
    public ClientRoleOptions f14409G = new ClientRoleOptions();

    /* renamed from: I */
    public volatile boolean f14411I = true;

    /* renamed from: J */
    public volatile int f14412J = -1;

    /* renamed from: K */
    public volatile ConcurrentLinkedQueue f14413K = new ConcurrentLinkedQueue();

    /* renamed from: M */
    public volatile int f14415M = -1;

    /* renamed from: R */
    public volatile boolean f14420R = true;

    /* renamed from: S */
    public volatile boolean f14421S = true;

    /* renamed from: U */
    public volatile int f14423U = 1;

    /* renamed from: V */
    public volatile ArrayList f14424V = new ArrayList();

    /* renamed from: W */
    public volatile ArrayList f14425W = new ArrayList();

    /* renamed from: X */
    public volatile ArrayList f14426X = new ArrayList();

    /* renamed from: a0 */
    public volatile int f14430a0 = -1;

    /* renamed from: b0 */
    public volatile int f14432b0 = -1;

    /* renamed from: com.vptrm.vcvroom.app.e$a */
    /* loaded from: classes3.dex */
    public static final class C9167a {
        public C9167a() {
        }

        /* renamed from: a */
        public final C9166e m21050a() {
            if (C9166e.f14401e0 == null) {
                synchronized (C9166e.f14402f0) {
                    try {
                        if (C9166e.f14401e0 == null) {
                            C9166e.f14401e0 = new C9166e();
                        }
                        C0172e0 c0172e0 = C0172e0.f512a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            C9166e c9166e = C9166e.f14401e0;
            AbstractC14656n.m8380d(c9166e);
            return c9166e;
        }

        public /* synthetic */ C9167a(AbstractC14648g abstractC14648g) {
            this();
        }
    }

    /* renamed from: com.vptrm.vcvroom.app.e$b */
    /* loaded from: classes3.dex */
    public static final class C9168b extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f14458a;

        public C9168b(InterfaceC14536b interfaceC14536b) {
            this.f14458a = interfaceC14536b;
        }

        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(SwitchPlayEntity switchPlayEntity) {
            InterfaceC14536b interfaceC14536b = this.f14458a;
            if (interfaceC14536b != null) {
                interfaceC14536b.onSuccess(switchPlayEntity);
            }
        }

        @Override // ad.AbstractC0132f
        public void onFail(String str, String str2) {
            InterfaceC14536b interfaceC14536b = this.f14458a;
            if (interfaceC14536b != null) {
                interfaceC14536b.onSuccess(null);
            }
        }
    }

    /* renamed from: com.vptrm.vcvroom.app.e$c */
    /* loaded from: classes3.dex */
    public static final class C9169c implements RequestCallback {

        /* renamed from: b */
        public final /* synthetic */ RoomInfoEntity f14460b;

        public C9169c(RoomInfoEntity roomInfoEntity) {
            C9166e.this = r1;
            this.f14460b = roomInfoEntity;
        }

        @Override // com.netease.nimlib.sdk.RequestCallback
        /* renamed from: a */
        public void onSuccess(EnterChatRoomResultData enterChatRoomResultData) {
            C15916b.m5060d("进入聊天室成功");
            System.out.println((Object) "=====登录云信聊天室======成功===");
            C9166e.f14400d0.m21050a().m21065s0(true);
            C9072a.m21420c("KEY_ENTER_CHAT_ROOM_EX_SUCCESS", Boolean.TRUE);
        }

        @Override // com.netease.nimlib.sdk.RequestCallback
        public void onException(Throwable exception) {
            String str;
            AbstractC14656n.m8377g(exception, "exception");
            String message = exception.getMessage();
            System.out.println((Object) ("=====登录云信聊天室====错误===exception==" + message));
            C9166e c9166e = C9166e.this;
            StatusCode status = NIMClient.getStatus();
            RoomInfoEntity roomInfoEntity = this.f14460b;
            if (roomInfoEntity != null) {
                str = roomInfoEntity.getYxRoomId();
            } else {
                str = null;
            }
            String message2 = exception.getMessage();
            c9166e.m21090g1("登录云信聊天室 登录错误0：" + status + " ==== 房间yxRoomId：" + str + "  ==== exception.message:" + message2, -1);
            C9072a.m21420c("KEY_ENTER_CHAT_ROOM_EX_FAILED", Boolean.TRUE);
        }

        @Override // com.netease.nimlib.sdk.RequestCallback
        public void onFailed(int i) {
            String str;
            C9166e c9166e = C9166e.this;
            StatusCode status = NIMClient.getStatus();
            RoomInfoEntity roomInfoEntity = this.f14460b;
            if (roomInfoEntity != null) {
                str = roomInfoEntity.getYxRoomId();
            } else {
                str = null;
            }
            c9166e.m21090g1("登录云信聊天室 登录失败0：" + status + " ==== 房间yxRoomId：" + str + "  ==== code:" + i, -1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("=====登录云信聊天室======失败=code==");
            sb2.append(i);
            System.out.println((Object) sb2.toString());
            C9072a.m21420c("KEY_ENTER_CHAT_ROOM_EX_FAILED", Boolean.TRUE);
        }
    }

    /* renamed from: com.vptrm.vcvroom.app.e$d */
    /* loaded from: classes3.dex */
    public static final class C9170d extends AbstractC14657o implements InterfaceC14412l {
        final /* synthetic */ Context $context;
        final /* synthetic */ ImageView $ivMusicIcon;
        final /* synthetic */ ImageView $ivPlayPause;
        final /* synthetic */ SeekBar $seekSong;
        final /* synthetic */ TextView $tvSongEnd;
        final /* synthetic */ TextView $tvSongStart;
        final /* synthetic */ TextView $tvSongTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9170d(Context context, TextView textView, ImageView imageView, TextView textView2, TextView textView3, SeekBar seekBar, ImageView imageView2) {
            super(1);
            C9166e.this = r1;
            this.$context = context;
            this.$tvSongTitle = textView;
            this.$ivPlayPause = imageView;
            this.$tvSongStart = textView2;
            this.$tvSongEnd = textView3;
            this.$seekSong = seekBar;
            this.$ivMusicIcon = imageView2;
        }

        /* renamed from: b */
        public final void m21047b(Long l) {
            C9166e.this.m21087h1(this.$context, this.$tvSongTitle, this.$ivPlayPause, this.$tvSongStart, this.$tvSongEnd, this.$seekSong, this.$ivMusicIcon);
        }

        @Override // p397jf.InterfaceC14412l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m21047b((Long) obj);
            return C0172e0.f512a;
        }
    }

    /* renamed from: com.vptrm.vcvroom.app.e$e */
    /* loaded from: classes3.dex */
    public static final class C9171e extends AbstractC0132f {
        @Override // ad.AbstractC0132f
        public void onFail(String str, String str2) {
        }

        @Override // ad.AbstractC0132f
        public void onSuccess(Object obj) {
        }
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.app.d.accept(java.lang.Object):void] */
    /* renamed from: a */
    public static /* synthetic */ void m21110a(InterfaceC14412l interfaceC14412l, Object obj) {
        m21099d1(interfaceC14412l, obj);
    }

    /* renamed from: d1 */
    public static final void m21099d1(InterfaceC14412l tmp0, Object obj) {
        AbstractC14656n.m8377g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static /* synthetic */ void m21085i0(C9166e c9166e, int i, long j, InterfaceC14536b interfaceC14536b, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            interfaceC14536b = null;
        }
        c9166e.m21088h0(i, j, interfaceC14536b);
    }

    /* renamed from: j */
    public static /* synthetic */ void m21084j(C9166e c9166e, InterfaceC14536b interfaceC14536b, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC14536b = null;
        }
        c9166e.m21086i(interfaceC14536b);
    }

    /* renamed from: A */
    public final int m21162A() {
        return this.f14449r;
    }

    /* renamed from: A0 */
    public final void m21161A0(int i) {
        this.f14451t = i;
    }

    /* renamed from: B */
    public final String m21160B() {
        return this.f14450s;
    }

    /* renamed from: B0 */
    public final void m21159B0(int i) {
        this.f14449r = i;
    }

    /* renamed from: C */
    public final VptMusicEntity m21158C() {
        return this.f14427Y;
    }

    /* renamed from: C0 */
    public final void m21157C0(String str) {
        this.f14450s = str;
    }

    /* renamed from: D */
    public final RoomInfoEntity m21156D() {
        return this.f14431b;
    }

    /* renamed from: D0 */
    public final void m21155D0(VptMusicEntity vptMusicEntity) {
        this.f14427Y = vptMusicEntity;
    }

    /* renamed from: E */
    public final boolean m21154E() {
        return this.f14419Q;
    }

    /* renamed from: E0 */
    public final void m21153E0(int i) {
        this.f14430a0 = i;
    }

    /* renamed from: F */
    public final VptMusicEntity m21152F() {
        return this.f14428Z;
    }

    /* renamed from: F0 */
    public final void m21151F0(RoomInfoEntity roomInfoEntity) {
        this.f14431b = roomInfoEntity;
    }

    /* renamed from: G */
    public final MyVideoChatRoomEntity m21150G() {
        return this.f14429a;
    }

    /* renamed from: G0 */
    public final void m21149G0(boolean z) {
        this.f14419Q = z;
    }

    /* renamed from: H */
    public final UserEntity m21148H() {
        return this.f14455x;
    }

    /* renamed from: H0 */
    public final void m21147H0(VptMusicEntity vptMusicEntity) {
        this.f14428Z = vptMusicEntity;
    }

    /* renamed from: I */
    public final int m21146I() {
        return this.f14415M;
    }

    /* renamed from: I0 */
    public final void m21145I0(MyVideoChatRoomEntity myVideoChatRoomEntity) {
        this.f14429a = myVideoChatRoomEntity;
    }

    /* renamed from: J */
    public final int m21144J() {
        return this.f14423U;
    }

    /* renamed from: J0 */
    public final void m21143J0(UserEntity userEntity) {
        this.f14455x = userEntity;
    }

    /* renamed from: K */
    public final ArrayList m21142K() {
        return this.f14440i;
    }

    /* renamed from: K0 */
    public final void m21141K0(int i) {
        this.f14415M = i;
    }

    /* renamed from: L */
    public final ArrayList m21140L() {
        return this.f14424V;
    }

    /* renamed from: L0 */
    public final void m21139L0(int i) {
        this.f14423U = i;
    }

    /* renamed from: M */
    public final String m21138M() {
        return this.f14456y;
    }

    /* renamed from: M0 */
    public final void m21137M0(ArrayList arrayList) {
        AbstractC14656n.m8377g(arrayList, "<set-?>");
        this.f14440i = arrayList;
    }

    /* renamed from: N */
    public final ArrayList m21136N() {
        return this.f14425W;
    }

    /* renamed from: N0 */
    public final void m21135N0(String str) {
        this.f14456y = str;
    }

    /* renamed from: O */
    public final Integer m21134O() {
        return this.f14437f;
    }

    /* renamed from: O0 */
    public final void m21133O0(boolean z) {
        this.f14406D = z;
    }

    /* renamed from: P */
    public final MinimizeEventEntity m21132P() {
        return this.f14417O;
    }

    /* renamed from: P0 */
    public final void m21131P0(Integer num) {
        this.f14437f = num;
    }

    /* renamed from: Q */
    public final int m21130Q() {
        return this.f14453v;
    }

    /* renamed from: Q0 */
    public final void m21129Q0(MinimizeEventEntity minimizeEventEntity) {
        this.f14417O = minimizeEventEntity;
    }

    /* renamed from: R */
    public final int m21128R() {
        return this.f14454w;
    }

    /* renamed from: R0 */
    public final void m21127R0(int i) {
        this.f14453v = i;
    }

    /* renamed from: S */
    public final List m21126S() {
        return this.f14443l;
    }

    /* renamed from: S0 */
    public final void m21125S0(int i) {
        this.f14454w = i;
    }

    /* renamed from: T */
    public final C15166b m21124T() {
        return this.f14436e;
    }

    /* renamed from: T0 */
    public final void m21123T0(boolean z) {
        this.f14410H = z;
    }

    /* renamed from: U */
    public final ArrayList m21122U() {
        return this.f14435d;
    }

    /* renamed from: U0 */
    public final void m21121U0(C15166b c15166b) {
        this.f14436e = c15166b;
    }

    /* renamed from: V */
    public final RoomPkInfoEntity m21120V() {
        return this.f14438g;
    }

    /* renamed from: V0 */
    public final void m21119V0(boolean z) {
        this.f14416N = z;
    }

    /* renamed from: W */
    public final ArrayList m21118W() {
        return this.f14403A;
    }

    /* renamed from: W0 */
    public final void m21117W0(boolean z) {
        this.f14442k = z;
    }

    /* renamed from: X */
    public final long m21116X() {
        return this.f14433c;
    }

    /* renamed from: X0 */
    public final void m21115X0(RoomPkInfoEntity roomPkInfoEntity) {
        this.f14438g = roomPkInfoEntity;
    }

    /* renamed from: Y */
    public final boolean m21114Y() {
        return this.f14405C;
    }

    /* renamed from: Y0 */
    public final void m21113Y0(boolean z) {
        this.f14411I = z;
    }

    /* renamed from: Z */
    public final boolean m21112Z() {
        return this.f14408F;
    }

    /* renamed from: Z0 */
    public final void m21111Z0(ArrayList arrayList) {
        this.f14403A = arrayList;
    }

    /* renamed from: a0 */
    public final boolean m21109a0() {
        return this.f14441j;
    }

    /* renamed from: a1 */
    public final void m21108a1(long j) {
        this.f14433c = j;
    }

    /* renamed from: b0 */
    public final boolean m21106b0() {
        return this.f14406D;
    }

    /* renamed from: b1 */
    public final void m21105b1(boolean z) {
        this.f14404B = z;
    }

    /* renamed from: c0 */
    public final boolean m21103c0() {
        return this.f14410H;
    }

    /* renamed from: c1 */
    public final void m21102c1(Context context, TextView textView, ImageView imageView, TextView textView2, TextView textView3, SeekBar seekBar, ImageView imageView2) {
        m21089h();
        Observable<Long> observeOn = Observable.interval(0L, 1000L, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread());
        final C9170d c9170d = new C9170d(context, textView, imageView, textView2, textView3, seekBar, imageView2);
        this.f14434c0 = observeOn.subscribe(new Consumer() { // from class: com.vptrm.vcvroom.app.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9166e.m21110a(c9170d, obj);
            }
        });
    }

    /* renamed from: d0 */
    public final boolean m21100d0() {
        return this.f14416N;
    }

    /* renamed from: e0 */
    public final boolean m21097e0() {
        return this.f14442k;
    }

    /* renamed from: e1 */
    public final String m21096e1(String str, String str2) {
        int m8221Z = C14721u.m8221Z(str, str2, 0, false, 6, null);
        if (m8221Z >= 0 && m8221Z < str.length() - 1) {
            String substring = str.substring(m8221Z + str2.length());
            AbstractC14656n.m8378f(substring, "substring(...)");
            return substring;
        }
        return "";
    }

    /* renamed from: f */
    public final void m21095f(EnterEffAniToastEntity enterEffAniToastEntity) {
        if (enterEffAniToastEntity != null) {
            this.f14413K.offer(enterEffAniToastEntity);
        }
    }

    /* renamed from: f0 */
    public final boolean m21094f0() {
        return this.f14411I;
    }

    /* renamed from: f1 */
    public final void m21093f1() {
        try {
            RtcEngine m21558i = C9017t.f13980g.m21550a().m21558i();
            if (m21558i != null) {
                ClientRoleOptions clientRoleOptions = new ClientRoleOptions();
                this.f14419Q = false;
                C9302b.m20472t(false);
                m21558i.adjustRecordingSignalVolume(0);
                C9167a c9167a = f14400d0;
                if (c9167a.m21050a().f14408F) {
                    clientRoleOptions.audienceLatencyLevel = 1;
                    m21558i.setClientRole(2, clientRoleOptions);
                } else {
                    m21558i.setClientRole(2);
                }
                c9167a.m21050a().f14405C = false;
                c9167a.m21050a().f14419Q = this.f14419Q;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m21092g(com.vptrm.common.entity.VptMusicEntity r18, boolean r19, android.content.Context r20, android.widget.TextView r21, android.widget.ImageView r22, android.widget.TextView r23, android.widget.TextView r24, android.widget.SeekBar r25, android.widget.ImageView r26) {
        int r1;
        int r8;
        java.lang.String r0;
        io.agora.rtc2.RtcEngine r3;
        io.agora.rtc2.RtcEngine r0;
        java.lang.String r0;
        p455nd.C15474h.C15475a r3;
        java.lang.String r5;
        com.blankj.utilcode.util.AbstractC2603r.m36103H("agoralStartAudio-item: " + r18);
        com.blankj.utilcode.util.AbstractC2603r.m36103H("agoralStartAudio-playNow: " + r19);
        if (r18 != null) {
            com.blankj.utilcode.util.AbstractC2603r.m36103H("音乐地址-getAudioFileUrl", r18.getAudioFileUrl());
            if (r19) {
                java.lang.String r4 = r18.getAudioFileUrl();
                try {
                } catch (java.lang.Exception e) {
                    r0 = e;
                }
                if (!android.text.TextUtils.isEmpty(r4)) {
                    kotlin.jvm.internal.AbstractC14656n.m8378f(r4, "audioFileUrl");
                    if (!kotlin.text.C14720t.m8266E(r4, "http:", false, 2, null)) {
                        kotlin.jvm.internal.AbstractC14656n.m8378f(r4, "audioFileUrl");
                        if (kotlin.text.C14720t.m8266E(r4, "https:", false, 2, null)) {
                        }
                    }
                    kotlin.jvm.internal.AbstractC14656n.m8378f(r4, "audioFileUrl");
                    try {
                        r0 = m21096e1(r4, "/");
                        r3 = p455nd.C15474h.f30792d;
                    } catch (java.lang.Exception e) {
                        r0 = e;
                    }
                    try {
                        r5 = r3.m6334a().m6335h("Music", com.vptrm.vcvroom.app.App.f14383A.m21182a()) + java.io.File.separator + r0;
                        java.lang.Object[] r6 = new java.lang.Object[2];
                        r6[0] = "下载音乐-fileName";
                        r6[1] = r0;
                        com.blankj.utilcode.util.AbstractC2603r.m36103H(r6);
                    } catch (java.lang.Exception e) {
                        r0 = e;
                        r0.printStackTrace();
                        r0 = r4;
                        r1 = 1;
                        m21102c1(r20, r21, r22, r23, r24, r25, r26);
                        com.blankj.utilcode.util.AbstractC2603r.m36103H("===音乐==开始播放=audioFileUrl==" + r0);
                        com.vptrm.common.utils.C9017t.C9019b r2 = com.vptrm.common.utils.C9017t.f13980g;
                        r3 = r2.m21550a().m21558i();
                        if (r3 != null) {
                        }
                        if (r22 != null) {
                        }
                        r0 = r2.m21550a().m21558i();
                        if (r0 != null) {
                        }
                        com.vptrm.vcvroom.app.C9166e.f14400d0.m21050a().f14410H = true;
                        if (r21 != null) {
                        }
                        if (r23 != null) {
                        }
                        r8 = com.vptrm.common.utils.C8973b0.m21658f(r18.getAudioTime());
                        java.lang.Object[] r2 = new java.lang.Object[r1];
                        r2[0] = "获取时长:" + r8;
                        com.blankj.utilcode.util.AbstractC2603r.m36093i(r2);
                        java.lang.String r0 = com.vptrm.common.utils.C8973b0.m21638z(r8);
                        if (r24 != null) {
                        }
                        if (r25 != null) {
                        }
                        if (r26 != null) {
                        }
                        com.vptrm.library.helper.C9072a.m21420c("VPT_EVENT_CHANGE_CURRENT_MUSIC", r18);
                    }
                    if (r3.m6334a().m6337f(r5)) {
                        java.lang.Object[] r0 = new java.lang.Object[2];
                        r0[0] = "下载音乐-savePath";
                        r0[1] = r5;
                        com.blankj.utilcode.util.AbstractC2603r.m36103H(r0);
                        r0 = r5;
                        r1 = 1;
                        m21102c1(r20, r21, r22, r23, r24, r25, r26);
                        com.blankj.utilcode.util.AbstractC2603r.m36103H("===音乐==开始播放=audioFileUrl==" + r0);
                        com.vptrm.common.utils.C9017t.C9019b r2 = com.vptrm.common.utils.C9017t.f13980g;
                        r3 = r2.m21550a().m21558i();
                        if (r3 != null) {
                            r3.startAudioMixing(r0, false, 1, 0);
                        }
                        if (r22 != null) {
                            r22.setBackgroundResource(com.vptrm.vcvroom.R.drawable.icon_vpt_music_pause);
                        }
                        r0 = r2.m21550a().m21558i();
                        if (r0 != null) {
                            r0.resumeAudioMixing();
                        }
                        com.vptrm.vcvroom.app.C9166e.f14400d0.m21050a().f14410H = true;
                    } else {
                        r0 = r4;
                        r1 = 1;
                        m21102c1(r20, r21, r22, r23, r24, r25, r26);
                        com.blankj.utilcode.util.AbstractC2603r.m36103H("===音乐==开始播放=audioFileUrl==" + r0);
                        com.vptrm.common.utils.C9017t.C9019b r2 = com.vptrm.common.utils.C9017t.f13980g;
                        r3 = r2.m21550a().m21558i();
                        if (r3 != null) {
                        }
                        if (r22 != null) {
                        }
                        r0 = r2.m21550a().m21558i();
                        if (r0 != null) {
                        }
                        com.vptrm.vcvroom.app.C9166e.f14400d0.m21050a().f14410H = true;
                    }
                }
                r0 = r4;
                r1 = 1;
                m21102c1(r20, r21, r22, r23, r24, r25, r26);
                com.blankj.utilcode.util.AbstractC2603r.m36103H("===音乐==开始播放=audioFileUrl==" + r0);
                com.vptrm.common.utils.C9017t.C9019b r2 = com.vptrm.common.utils.C9017t.f13980g;
                r3 = r2.m21550a().m21558i();
                if (r3 != null) {
                }
                if (r22 != null) {
                }
                r0 = r2.m21550a().m21558i();
                if (r0 != null) {
                }
                com.vptrm.vcvroom.app.C9166e.f14400d0.m21050a().f14410H = true;
            } else {
                r1 = 1;
            }
            if (r21 != null) {
                r21.setText(r18.getAudioName());
            }
            if (r23 != null) {
                r23.setText("00:00");
            }
            try {
                r8 = com.vptrm.common.utils.C8973b0.m21658f(r18.getAudioTime());
            } catch (java.lang.Exception r0) {
                r0.printStackTrace();
                r8 = 0;
            }
            java.lang.Object[] r2 = new java.lang.Object[r1];
            r2[0] = "获取时长:" + r8;
            com.blankj.utilcode.util.AbstractC2603r.m36093i(r2);
            java.lang.String r0 = com.vptrm.common.utils.C8973b0.m21638z(r8);
            if (r24 != null) {
                r24.setText(r0);
            }
            if (r25 != null) {
                r25.setMax(r8 * 1000);
            }
            if (r26 != null) {
                try {
                    com.vptrm.library.utils.ImageLoader.m21369w(r26, r18.getAudioIcon());
                } catch (java.lang.Exception r0) {
                    java.lang.Object[] r1 = new java.lang.Object[r1];
                    r1[0] = "e:" + r0;
                    com.blankj.utilcode.util.AbstractC2603r.m36093i(r1);
                }
            }
            com.vptrm.library.helper.C9072a.m21420c("VPT_EVENT_CHANGE_CURRENT_MUSIC", r18);
        }
    }

    /* renamed from: g0 */
    public final boolean m21091g0() {
        return this.f14404B;
    }

    /* renamed from: g1 */
    public final void m21090g1(String errorInfo, int i) {
        AbstractC14656n.m8377g(errorInfo, "errorInfo");
        try {
            if (!AbstractC2571f0.m36259d(errorInfo)) {
                HashMap hashMap = new HashMap();
                hashMap.put("data", errorInfo);
                hashMap.put("type", Integer.valueOf(i));
                C0127c.m38783j0(hashMap).subscribe(new C9171e());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h */
    public final void m21089h() {
        Disposable disposable = this.f14434c0;
        if (disposable != null) {
            AbstractC14656n.m8380d(disposable);
            disposable.dispose();
            this.f14434c0 = null;
        }
    }

    /* renamed from: h0 */
    public final void m21088h0(int i, long j, InterfaceC14536b interfaceC14536b) {
        HashMap hashMap = new HashMap();
        hashMap.put("optType", Integer.valueOf(i));
        hashMap.put("roomId", Long.valueOf(j));
        C17594b.m773C1(hashMap).subscribe(new C9168b(interfaceC14536b));
    }

    /* renamed from: h1 */
    public final void m21087h1(Context context, TextView textView, ImageView imageView, TextView textView2, TextView textView3, SeekBar seekBar, ImageView imageView2) {
        int i;
        try {
            C9017t.C9019b c9019b = C9017t.f13980g;
            if (c9019b.m21550a().m21558i() != null) {
                C9167a c9167a = f14400d0;
                if (c9167a.m21050a().f14427Y != null) {
                    RtcEngine m21558i = c9019b.m21550a().m21558i();
                    if (m21558i != null) {
                        i = m21558i.getAudioMixingCurrentPosition();
                    } else {
                        i = 0;
                    }
                    VptMusicEntity vptMusicEntity = c9167a.m21050a().f14427Y;
                    AbstractC14656n.m8380d(vptMusicEntity);
                    int m21658f = C8973b0.m21658f(vptMusicEntity.getAudioTime()) * 1000;
                    if (m21658f - i > 1000) {
                        String m21638z = C8973b0.m21638z(i / 1000);
                        if (textView2 != null) {
                            textView2.setText(m21638z);
                        }
                        if (seekBar != null) {
                            seekBar.setProgress(i);
                            return;
                        }
                        return;
                    }
                    if (textView2 != null) {
                        VptMusicEntity vptMusicEntity2 = c9167a.m21050a().f14427Y;
                        AbstractC14656n.m8380d(vptMusicEntity2);
                        textView2.setText(vptMusicEntity2.getAudioTime());
                    }
                    if (seekBar != null) {
                        seekBar.setProgress(m21658f);
                    }
                    AbstractC2603r.m36093i("播放结束");
                    m21081k0(context, textView, imageView, textView2, textView3, seekBar, imageView2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00d8, code lost:
        r17.onSuccess(null);
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m21086i(p413kd.InterfaceC14536b r17) {
        com.blankj.utilcode.util.C2564c0.m36298b().m36286n("VPT_MYSELF_IN_ROOM_NOW_OF_ROOMID", 0L);
        com.blankj.utilcode.util.C2564c0.m36298b().m36288l("VPT_MYSELF_IN_ROOM_NOW_OF_MIC_INDEX", -1);
        r16.f14437f = -1;
        com.blankj.utilcode.util.C2564c0.m36298b().m36288l("KEY_ROOM_TYPE", 0);
        com.vptrm.vcvroom.netease.C9302b.m20472t(false);
        com.vptrm.common.utils.C9017t.C9019b r2 = com.vptrm.common.utils.C9017t.f13980g;
        io.agora.rtc2.RtcEngine r9 = r2.m21550a().m21558i();
        if (r9 != null) {
            r9.stopAudioMixing();
        }
        p490pd.C15916b.m5062b("退出房间");
        io.agora.rtc2.RtcEngine r9 = r2.m21550a().m21558i();
        if (r9 != null) {
            r9.stopPreview();
        }
        io.agora.rtc2.RtcEngine r9 = r2.m21550a().m21558i();
        if (r9 != null) {
            r9.setClientRole(2);
        }
        io.agora.rtc2.RtcEngine r9 = r2.m21550a().m21558i();
        if (r9 != null) {
            r9.leaveChannel();
        }
        com.blankj.utilcode.util.C2564c0.m36298b().m36284p("SP_ROOM_CHAT_MINIMIZE_ENTITY", "");
        com.vptrm.vcvroom.helper.room.C9257a.f20281c.m20582a().m20584n();
        com.vptrm.vcvroom.entity.RoomInfoEntity r9 = r16.f14431b;
        if (r9 != null) {
            if (com.vptrm.common.helper.C8923p.m21789e().m21787g() != null && r9.getRoomType() == 2) {
                try {
                    java.lang.String r12 = r9.getHomeownerDreamNo();
                    if (r12 == null) {
                        r12 = com.facebook.appevents.AppEventsConstants.EVENT_PARAM_VALUE_NO;
                    } else {
                        kotlin.jvm.internal.AbstractC14656n.m8378f(r12, "it.homeownerDreamNo ?: \"0\"");
                    }
                    java.lang.Integer r14 = r9.getRelationType();
                    if (r14 != null && r14.intValue() == 1) {
                        java.lang.Long r14 = r9.getId();
                        kotlin.jvm.internal.AbstractC14656n.m8378f(r14, "it.id");
                        m21088h0(2, r14.longValue(), r17);
                        io.agora.rtc2.RtcEngine r0 = r2.m21550a().m21558i();
                        if (r0 != null) {
                            r0.setupLocalVideo(new io.agora.rtc2.video.VideoCanvas(null, 1, java.lang.Integer.parseInt(r12)));
                        }
                    }
                    io.agora.rtc2.RtcEngine r0 = r2.m21550a().m21558i();
                    if (r0 != null) {
                        r0.setupRemoteVideo(new io.agora.rtc2.video.VideoCanvas(null, 1, java.lang.Integer.parseInt(r12)));
                    }
                } catch (java.lang.Exception r0) {
                    r0.printStackTrace();
                }
            }
            ((com.netease.nimlib.sdk.chatroom.ChatRoomService) com.netease.nimlib.sdk.NIMClient.getService(com.netease.nimlib.sdk.chatroom.ChatRoomService.class)).exitChatRoom(r9.getYxRoomId());
            com.vptrm.vcvroom.netease.C9302b.m20470v(-1);
            com.vptrm.library.helper.C9072a.m21420c("ROOM_CHAT_NORMAL_EXIT_ROOM", java.lang.Boolean.TRUE);
            if (!r16.f14444m) {
                com.vptrm.vcvroom.helper.C9233h r0 = com.vptrm.vcvroom.helper.C9233h.f20244a.m20621a();
                java.lang.Long r2 = r9.getId();
                kotlin.jvm.internal.AbstractC14656n.m8378f(r2, "it.id");
                r0.m20630d(r2.longValue());
            }
            com.blankj.utilcode.util.C2564c0.m36298b().m36280t("VPT_MYSELF_IN_ROOM_NOW", false);
            com.blankj.utilcode.util.C2564c0.m36298b().m36286n("VPT_MYSELF_IN_ROOM_NOW_OF_ROOMID", 0L);
            com.blankj.utilcode.util.C2564c0.m36298b().m36288l("VPT_MYSELF_IN_ROOM_NOW_OF_MIC_INDEX", -1);
        }
        m21082k();
    }

    /* renamed from: j0 */
    public final void m21083j0(RoomInfoEntity roomInfoEntity) {
        String str;
        if (roomInfoEntity != null) {
            roomInfoEntity.getYxRoomId();
        }
        if (roomInfoEntity != null) {
            str = roomInfoEntity.getYxRoomId();
        } else {
            str = null;
        }
        ((ChatRoomService) NIMClient.getService(ChatRoomService.class)).enterChatRoomEx(new EnterChatRoomData(str), 3).setCallback(new C9169c(roomInfoEntity));
    }

    /* renamed from: k */
    public final void m21082k() {
        C9072a.m21420c("KEY_CLOSE_SERVICE", Boolean.FALSE);
        this.f14446o = 1;
        this.f14447p = -1L;
        this.f14448q = -1;
        this.f14406D = false;
        this.f14457z = -1L;
        this.f14404B = false;
        ArrayList arrayList = this.f14403A;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f14412J = -1;
        this.f14415M = -1;
        this.f14453v = -1;
        this.f14454w = -1;
        this.f14411I = true;
        this.f14410H = false;
        this.f14419Q = false;
        this.f14414L = false;
        this.f14416N = false;
        this.f14413K.clear();
        this.f14443l.clear();
        this.f14420R = true;
        this.f14421S = true;
        this.f14405C = false;
        this.f14441j = false;
        this.f14439h.clear();
        this.f14449r = -1;
        this.f14418P = null;
        this.f14451t = 0;
        this.f14452u = false;
        this.f14444m = false;
        f14400d0.m21050a().m21089h();
        this.f14433c = 0L;
        this.f14435d.clear();
        this.f14438g = null;
        this.f14417O = null;
        this.f14431b = null;
    }

    /* renamed from: k0 */
    public final void m21081k0(Context context, TextView textView, ImageView imageView, TextView textView2, TextView textView3, SeekBar seekBar, ImageView imageView2) {
        String str;
        C9167a c9167a = f14400d0;
        if (c9167a.m21050a().f14427Y != null) {
            c9167a.m21050a().f14428Z = c9167a.m21050a().f14427Y;
        }
        if (c9167a.m21050a().f14423U == 1) {
            int m8486V = C14596u.m8486V(c9167a.m21050a().f14425W, c9167a.m21050a().f14427Y) + 1;
            if (m8486V == c9167a.m21050a().f14425W.size()) {
                m8486V = 0;
            }
            if (c9167a.m21050a().f14425W.size() > m8486V) {
                c9167a.m21050a().f14427Y = (VptMusicEntity) c9167a.m21050a().f14425W.get(m8486V);
            }
        }
        if (c9167a.m21050a().f14423U == 2) {
            int m8486V2 = C14596u.m8486V(c9167a.m21050a().f14425W, c9167a.m21050a().f14427Y);
            int random = (int) (Math.random() * c9167a.m21050a().f14425W.size());
            if (m8486V2 == random && (random = m8486V2 + 1) == c9167a.m21050a().f14425W.size()) {
                random = 0;
            }
            c9167a.m21050a().f14427Y = (VptMusicEntity) c9167a.m21050a().f14425W.get(random);
        }
        int i = c9167a.m21050a().f14423U;
        VptMusicEntity vptMusicEntity = c9167a.m21050a().f14427Y;
        if (vptMusicEntity != null) {
            str = vptMusicEntity.getAudioName();
        } else {
            str = null;
        }
        int i2 = c9167a.m21050a().f14423U;
        AbstractC2603r.m36093i("播放结束，下一首待播：" + str + "   mPlayModeIndex:" + i2);
        m21092g(c9167a.m21050a().f14427Y, true, context, textView, imageView, textView2, textView3, seekBar, imageView2);
    }

    /* renamed from: l */
    public final int m21080l() {
        return this.f14432b0;
    }

    /* renamed from: l0 */
    public final void m21079l0(boolean z) {
        this.f14444m = z;
    }

    /* renamed from: m */
    public final ArrayList m21078m() {
        return this.f14439h;
    }

    /* renamed from: m0 */
    public final void m21077m0(boolean z) {
        this.f14405C = z;
    }

    /* renamed from: n */
    public final int m21076n() {
        return this.f14445n;
    }

    /* renamed from: n0 */
    public final void m21075n0(int i) {
        this.f14432b0 = i;
    }

    /* renamed from: o */
    public final boolean m21074o() {
        return this.f14422T;
    }

    /* renamed from: o0 */
    public final void m21073o0(int i) {
        this.f14445n = i;
    }

    /* renamed from: p */
    public final boolean m21072p() {
        return this.f14420R;
    }

    /* renamed from: p0 */
    public final void m21071p0(boolean z) {
        this.f14422T = z;
    }

    /* renamed from: q */
    public final boolean m21070q() {
        return this.f14421S;
    }

    /* renamed from: q0 */
    public final void m21069q0(boolean z) {
        this.f14420R = z;
    }

    /* renamed from: r */
    public final boolean m21068r() {
        return this.f14414L;
    }

    /* renamed from: r0 */
    public final void m21067r0(boolean z) {
        this.f14421S = z;
    }

    /* renamed from: s */
    public final EnterEffAniToastEntity m21066s() {
        return (EnterEffAniToastEntity) this.f14413K.poll();
    }

    /* renamed from: s0 */
    public final void m21065s0(boolean z) {
        this.f14414L = z;
    }

    /* renamed from: t */
    public final int m21064t() {
        return this.f14448q;
    }

    /* renamed from: t0 */
    public final void m21063t0(boolean z) {
        this.f14408F = z;
    }

    /* renamed from: u */
    public final long m21062u() {
        return this.f14447p;
    }

    /* renamed from: u0 */
    public final void m21061u0(int i) {
        this.f14448q = i;
    }

    /* renamed from: v */
    public final int m21060v() {
        return this.f14446o;
    }

    /* renamed from: v0 */
    public final void m21059v0(long j) {
        this.f14447p = j;
    }

    /* renamed from: w */
    public final ArrayList m21058w() {
        return this.f14407E;
    }

    /* renamed from: w0 */
    public final void m21057w0(int i) {
        this.f14446o = i;
    }

    /* renamed from: x */
    public final LiveConnectEventBust m21056x() {
        return this.f14418P;
    }

    /* renamed from: x0 */
    public final void m21055x0(boolean z) {
        this.f14441j = z;
    }

    /* renamed from: y */
    public final boolean m21054y() {
        return this.f14452u;
    }

    /* renamed from: y0 */
    public final void m21053y0(LiveConnectEventBust liveConnectEventBust) {
        this.f14418P = liveConnectEventBust;
    }

    /* renamed from: z */
    public final int m21052z() {
        return this.f14451t;
    }

    /* renamed from: z0 */
    public final void m21051z0(boolean z) {
        this.f14452u = z;
    }
}
