package com.vptrm.vcvroom.helper;

import ad.AbstractC0132f;
import af.C0179i;
import af.EnumC0181j;
import af.InterfaceC0178h;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.blankj.utilcode.util.AbstractC2571f0;
import com.blankj.utilcode.util.AbstractC2595m;
import com.blankj.utilcode.util.AbstractC2603r;
import com.blankj.utilcode.util.C2564c0;
import com.vptrm.common.entity.MyVideoChatRoomEntity;
import com.vptrm.common.utils.C8994j;
import com.vptrm.library.helper.C9072a;
import com.vptrm.vcvroom.app.C9166e;
import com.vptrm.vcvroom.entity.MinimizeEventEntity;
import com.vptrm.vcvroom.entity.SearchRoomResultEntity;
import com.vptrm.vcvroom.netease.C9302b;
import com.vptrm.vcvroom.page.room.activity.VptRoomActivityV1;
import id.C14028j;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC14648g;
import kotlin.jvm.internal.AbstractC14656n;
import kotlin.jvm.internal.AbstractC14657o;
import p397jf.InterfaceC14401a;
import p413kd.InterfaceC14536b;
import p455nd.AbstractC15467c0;
import p490pd.C15916b;
import p612xd.C17594b;

/* renamed from: com.vptrm.vcvroom.helper.b */
/* loaded from: classes3.dex */
public final class C9192b {

    /* renamed from: b */
    public static final C9194b f20155b = new C9194b(null);

    /* renamed from: c */
    public static final Handler f20156c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public static final InterfaceC0178h f20157d = C0179i.m38721a(EnumC0181j.f521a, C9193a.f20159a);

    /* renamed from: a */
    public boolean f20158a;

    /* renamed from: com.vptrm.vcvroom.helper.b$a */
    /* loaded from: classes3.dex */
    public static final class C9193a extends AbstractC14657o implements InterfaceC14401a {

        /* renamed from: a */
        public static final C9193a f20159a = new C9193a();

        public C9193a() {
            super(0);
        }

        @Override // p397jf.InterfaceC14401a
        /* renamed from: b */
        public final C9192b invoke() {
            return new C9192b(null);
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.b$b */
    /* loaded from: classes3.dex */
    public static final class C9194b {
        public C9194b() {
        }

        /* renamed from: a */
        public final C9192b m20711a() {
            return (C9192b) C9192b.f20157d.getValue();
        }

        public /* synthetic */ C9194b(AbstractC14648g abstractC14648g) {
            this();
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.b$c */
    /* loaded from: classes3.dex */
    public static final class C9195c extends AbstractC0132f {

        /* renamed from: b */
        public final /* synthetic */ Activity f20161b;

        /* renamed from: c */
        public final /* synthetic */ Long f20162c;

        /* renamed from: d */
        public final /* synthetic */ Boolean f20163d;

        /* renamed from: e */
        public final /* synthetic */ int f20164e;

        /* renamed from: f */
        public final /* synthetic */ int f20165f;

        /* renamed from: g */
        public final /* synthetic */ String f20166g;

        /* renamed from: h */
        public final /* synthetic */ ArrayList f20167h;

        public C9195c(Activity activity, Long l, Boolean bool, int i, int i2, String str, ArrayList arrayList) {
            C9192b.this = r1;
            this.f20161b = activity;
            this.f20162c = l;
            this.f20163d = bool;
            this.f20164e = i;
            this.f20165f = i2;
            this.f20166g = str;
            this.f20167h = arrayList;
        }

        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(MyVideoChatRoomEntity myVideoChatRoomEntity) {
            C9072a.m21420c("KEY_CLICK_JOIN_ROOM", Boolean.TRUE);
            if (myVideoChatRoomEntity == null) {
                C9302b.m20468x(false);
                C9302b.m20467y(-1L);
                return;
            }
            C9166e.f14400d0.m21050a().m21145I0(myVideoChatRoomEntity);
            C9302b.m20468x(true);
            C9302b.m20467y(myVideoChatRoomEntity.getId());
        }

        @Override // ad.AbstractC0132f, io.reactivex.Observer
        public void onComplete() {
            super.onComplete();
            C9072a.m21420c("KEY_CLICK_JOIN_ROOM", Boolean.TRUE);
            C9192b.this.m20719h(this.f20161b, this.f20162c, this.f20163d, this.f20164e, this.f20165f, this.f20166g, this.f20167h);
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
            C9072a.m21420c("KEY_CLICK_JOIN_ROOM", Boolean.TRUE);
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.b$d */
    /* loaded from: classes3.dex */
    public static final class C9196d extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f20168a;

        public C9196d(InterfaceC14536b interfaceC14536b) {
            this.f20168a = interfaceC14536b;
        }

        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(SearchRoomResultEntity searchRoomResultEntity) {
            this.f20168a.onSuccess(searchRoomResultEntity);
        }

        @Override // ad.AbstractC0132f, io.reactivex.Observer
        public void onComplete() {
            super.onComplete();
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
            AbstractC15467c0.m6354c(errorMsg);
        }
    }

    public C9192b() {
    }

    /* renamed from: f */
    public static final C9192b m20721f() {
        return f20155b.m20711a();
    }

    /* renamed from: m */
    public static /* synthetic */ void m20714m(C9192b c9192b, Activity activity, Long l, Boolean bool, int i, int i2, String str, ArrayList arrayList, int i3, Object obj) {
        int i4;
        String str2;
        ArrayList arrayList2;
        if ((i3 & 16) != 0) {
            i4 = 1;
        } else {
            i4 = i2;
        }
        if ((i3 & 32) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i3 & 64) != 0) {
            arrayList2 = null;
        } else {
            arrayList2 = arrayList;
        }
        c9192b.m20715l(activity, l, bool, i, i4, str2, arrayList2);
    }

    /* renamed from: c */
    public final void m20724c(Activity activity, Long l, Boolean bool, int i, int i2, String str, ArrayList arrayList) {
        C15916b.m5060d("进入房间-04");
        C9198c c9198c = C9198c.f20173a;
        String HOT_ROOMLIST_CLICK = C8994j.f13939S;
        AbstractC14656n.m8378f(HOT_ROOMLIST_CLICK, "HOT_ROOMLIST_CLICK");
        c9198c.m20707b(HOT_ROOMLIST_CLICK, "首页点击房间");
        MyVideoChatRoomEntity m21150G = C9166e.f14400d0.m21050a().m21150G();
        if (m21150G != null) {
            C9072a.m21420c("KEY_CLICK_JOIN_ROOM", Boolean.TRUE);
            C9302b.m20468x(true);
            C9302b.m20467y(m21150G.getId());
            m20719h(activity, l, bool, i, i2, str, arrayList);
            return;
        }
        C17594b.m594m2().compose(C14028j.m9195a()).subscribe(new C9195c(activity, l, bool, i, i2, str, arrayList));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x002b A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:71:0x0005, B:75:0x0018, B:81:0x0026, B:83:0x002b, B:85:0x0037, B:89:0x0040, B:92:0x0052, B:95:0x005b, B:96:0x006c, B:98:0x0076, B:100:0x0085, B:101:0x0089, B:104:0x0093, B:105:0x00cf, B:109:0x0104, B:111:0x0110, B:114:0x0118, B:115:0x013d, B:117:0x0142, B:119:0x0149, B:120:0x0162, B:122:0x0167, B:124:0x016e), top: B:128:0x0005 }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m20723d(android.app.Activity r16, java.lang.Long r17, java.lang.Boolean r18, boolean r19, int r20, int r21, java.lang.String r22, java.util.ArrayList r23) {
        boolean r1;
        long r4;
        long r4;
        try {
            p490pd.C15916b.m5060d("进入房间-06");
            long r1 = com.vptrm.vcvroom.netease.C9302b.m20480l();
            if (r1 != -1 && r17 != null && r1 == r17.longValue()) {
                r1 = true;
                r15.f20158a = r1;
                java.lang.String r2 = null;
                if (!r1) {
                    com.vptrm.vcvroom.app.C9166e.C9167a r1 = com.vptrm.vcvroom.app.C9166e.f14400d0;
                    com.vptrm.vcvroom.entity.RoomInfoEntity r3 = r1.m21050a().m21156D();
                    if (r3 != null && r3.getRoomType() == 1 && r21 == 3) {
                        p455nd.AbstractC15467c0.m6354c(com.vptrm.vcvroom.app.App.f14383A.m21182a().getString(com.vptrm.vcvroom.R.string.room_live_you_currently_voice_chat_cannot_switch_rooms));
                        return;
                    } else if (r3 != null && r3.getRoomType() == 2 && r21 == 2) {
                        p455nd.AbstractC15467c0.m6354c(com.vptrm.vcvroom.app.App.f14383A.m21182a().getString(com.vptrm.vcvroom.R.string.room_live_unable_switch_room));
                        return;
                    } else if (r1.m21050a().m21150G() != null) {
                        com.vptrm.library.helper.C9072a.m21420c("KEY_CLICK_JOIN_ROOM", java.lang.Boolean.TRUE);
                        com.vptrm.common.entity.MyVideoChatRoomEntity r3 = r1.m21050a().m21150G();
                        if (r3 != null) {
                            r2 = r3.getLockFlag();
                        }
                        if (kotlin.jvm.internal.AbstractC14656n.m8382b(r2, "1")) {
                            com.vptrm.common.entity.MyVideoChatRoomEntity r2 = r1.m21050a().m21150G();
                            kotlin.jvm.internal.AbstractC14656n.m8380d(r2);
                            java.lang.Long r2 = r2.getId();
                            kotlin.jvm.internal.AbstractC14656n.m8378f(r2, "AvRoomDataManager.get().mMyRoomEntity!!.id");
                            long r4 = r2.longValue();
                            com.vptrm.common.entity.MyVideoChatRoomEntity r1 = r1.m21050a().m21150G();
                            kotlin.jvm.internal.AbstractC14656n.m8380d(r1);
                            m20713n(r20, r16, r4, true, r1.getPassword(), m20720g(), r18, r21, r22, r23);
                            return;
                        }
                        com.vptrm.common.entity.MyVideoChatRoomEntity r1 = r1.m21050a().m21150G();
                        kotlin.jvm.internal.AbstractC14656n.m8380d(r1);
                        java.lang.Long r1 = r1.getId();
                        kotlin.jvm.internal.AbstractC14656n.m8378f(r1, "AvRoomDataManager.get().mMyRoomEntity!!.id");
                        m20713n(r20, r16, r1.longValue(), true, "", m20720g(), r18, r21, r22, r23);
                        return;
                    } else {
                        return;
                    }
                } else if (r19) {
                    com.vptrm.vcvroom.entity.RoomInfoEntity r5 = com.vptrm.vcvroom.app.C9166e.f14400d0.m21050a().m21156D();
                    if (r5 != null) {
                        java.lang.String r1 = r5.getPassword();
                        if (r1 == null) {
                            r1 = "";
                        }
                        java.lang.String r7 = r1;
                        java.lang.Long r1 = r5.getId();
                        kotlin.jvm.internal.AbstractC14656n.m8378f(r1, "mCurrentRoomInfo.id");
                        m20713n(r20, r16, r1.longValue(), r15.f20158a, r7, m20720g(), r18, r21, r22, r23);
                        return;
                    }
                    com.vptrm.library.helper.C9072a.m21420c("ROOM_CHAT_MINIMIZE_ENTITY", null);
                    if (r17 != null) {
                        r4 = r17.longValue();
                    } else {
                        r4 = 0;
                    }
                    m20713n(r20, r16, r4, r15.f20158a, "", m20720g(), r18, r21, r22, r23);
                    return;
                } else {
                    com.vptrm.library.helper.C9072a.m21420c("ROOM_CHAT_MINIMIZE_ENTITY", null);
                    if (r17 != null) {
                        r4 = r17.longValue();
                    } else {
                        r4 = 0;
                    }
                    m20713n(r20, r16, r4, r15.f20158a, "", m20720g(), r18, r21, r22, r23);
                    return;
                }
            }
            r1 = false;
            r15.f20158a = r1;
            java.lang.String r2 = null;
            if (!r1) {
            }
        } catch (java.lang.Exception r0) {
            com.vptrm.library.helper.C9072a.m21420c("KEY_CLICK_JOIN_ROOM", java.lang.Boolean.TRUE);
            r0.printStackTrace();
        }
    }

    /* renamed from: e */
    public final void m20722e(Activity activity, String str, InterfaceC14536b callback) {
        AbstractC14656n.m8377g(activity, "activity");
        AbstractC14656n.m8377g(callback, "callback");
        HashMap hashMap = new HashMap();
        hashMap.put("searchValue", str);
        C17594b.m559t2(hashMap).compose(C14028j.m9195a()).subscribe(new C9196d(callback));
    }

    /* renamed from: g */
    public final MinimizeEventEntity m20720g() {
        String m36292h = C2564c0.m36298b().m36292h("SP_ROOM_CHAT_MINIMIZE_ENTITY", "");
        if (!AbstractC2571f0.m36259d(m36292h)) {
            Object m36176d = AbstractC2595m.m36176d(m36292h, MinimizeEventEntity.class);
            AbstractC14656n.m8378f(m36176d, "fromJson(\n              …:class.java\n            )");
            return (MinimizeEventEntity) m36176d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0055 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:50:0x002b, B:54:0x0038, B:60:0x0046, B:62:0x0055, B:64:0x005f, B:66:0x006d, B:68:0x0074, B:71:0x007b, B:74:0x0083, B:75:0x0094), top: B:83:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005e  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m20719h(android.app.Activity r13, java.lang.Long r14, java.lang.Boolean r15, int r16, int r17, java.lang.String r18, java.util.ArrayList r19) {
        boolean r1;
        com.vptrm.vcvroom.entity.RoomInfoEntity r3;
        java.lang.Integer r6;
        java.lang.Integer r3;
        java.lang.String r1 = com.vptrm.vcvroom.netease.C9302b.m20486f();
        p490pd.C15916b.m5060d("进入房间-05");
        p490pd.C15916b.m5059e("切换房间 - lastEnterRoomId", r1);
        p490pd.C15916b.m5059e("切换房间 - roomId", r14);
        kotlin.jvm.internal.AbstractC14656n.m8378f(r1, "lastEnterRoomId");
        if (r1.length() > 0 && !kotlin.jvm.internal.AbstractC14656n.m8382b(java.lang.String.valueOf(r14), r1)) {
            try {
                long r1 = com.vptrm.vcvroom.netease.C9302b.m20480l();
                if (r1 != -1 && r14 != null && r1 == r14.longValue()) {
                    r1 = true;
                    com.vptrm.vcvroom.app.C9166e.C9167a r2 = com.vptrm.vcvroom.app.C9166e.f14400d0;
                    r3 = r2.m21050a().m21156D();
                    if (r3 == null) {
                        r6 = java.lang.Integer.valueOf(r3.getRoomType());
                    } else {
                        r6 = null;
                    }
                    p490pd.C15916b.m5059e("切换房间 - mCurrentRoomInfo", r6);
                    p490pd.C15916b.m5059e("切换房间 - isMyRoom", java.lang.Boolean.valueOf(r1));
                    if (r3 != null && r3.getRoomType() == 2 && (r3 = r3.getRelationType()) != null && r3.intValue() == 1 && !r1) {
                        p455nd.AbstractC15467c0.m6354c(com.vptrm.vcvroom.app.App.f14383A.m21182a().getString(com.vptrm.vcvroom.R.string.room_live_unable_switch_room));
                        return;
                    }
                    com.vptrm.vcvroom.app.C9166e.m21084j(r2.m21050a(), null, 1, null);
                    com.vptrm.library.helper.C9072a.m21420c("VPT_CHECK_NEED_DESTROY_ROOM_ACTIVYT", java.lang.Boolean.TRUE);
                    m20723d(r13, r14, r15, false, r16, r17, r18, r19);
                }
                r1 = false;
                com.vptrm.vcvroom.app.C9166e.C9167a r2 = com.vptrm.vcvroom.app.C9166e.f14400d0;
                r3 = r2.m21050a().m21156D();
                if (r3 == null) {
                }
                p490pd.C15916b.m5059e("切换房间 - mCurrentRoomInfo", r6);
                p490pd.C15916b.m5059e("切换房间 - isMyRoom", java.lang.Boolean.valueOf(r1));
                if (r3 != null) {
                    p455nd.AbstractC15467c0.m6354c(com.vptrm.vcvroom.app.App.f14383A.m21182a().getString(com.vptrm.vcvroom.R.string.room_live_unable_switch_room));
                    return;
                }
                com.vptrm.vcvroom.app.C9166e.m21084j(r2.m21050a(), null, 1, null);
                com.vptrm.library.helper.C9072a.m21420c("VPT_CHECK_NEED_DESTROY_ROOM_ACTIVYT", java.lang.Boolean.TRUE);
                m20723d(r13, r14, r15, false, r16, r17, r18, r19);
            } catch (java.lang.Exception r0) {
                r0.printStackTrace();
                com.blankj.utilcode.util.AbstractC2603r.m36093i("异常：" + r0);
            }
        } else if (r1.length() == 0) {
            m20723d(r13, r14, r15, false, r16, r17, r18, r19);
        } else {
            m20723d(r13, r14, r15, true, r16, r17, r18, r19);
        }
    }

    /* renamed from: i */
    public final void m20718i(Activity activity, Long l, int i) {
        AbstractC14656n.m8377g(activity, "activity");
        C15916b.m5060d("进入房间-01");
        m20714m(this, activity, l, Boolean.FALSE, i, 0, null, null, 112, null);
    }

    /* renamed from: j */
    public final void m20717j(Activity activity, Long l, int i, int i2, ArrayList arrayList) {
        AbstractC14656n.m8377g(activity, "activity");
        C15916b.m5060d("进入房间-01");
        m20714m(this, activity, l, Boolean.FALSE, i, i2, null, arrayList, 32, null);
    }

    /* renamed from: k */
    public final void m20716k(Activity activity, Long l, int i, String str) {
        AbstractC14656n.m8377g(activity, "activity");
        C15916b.m5060d("进入房间-01");
        m20714m(this, activity, l, Boolean.FALSE, i, 0, str, null, 80, null);
    }

    /* renamed from: l */
    public final void m20715l(Activity activity, Long l, Boolean bool, int i, int i2, String str, ArrayList arrayList) {
        AbstractC14656n.m8377g(activity, "activity");
        long m36294f = C2564c0.m36298b().m36294f("VPT_ENTER_ROOM_ANTI_SHAKE", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        C15916b.m5060d("进入房间-02");
        long j = currentTimeMillis - m36294f;
        if (j <= 1000 && j > 0) {
            AbstractC2603r.m36093i("进入房间点击过快，防抖一下");
        } else {
            C15916b.m5060d("进入房间-03");
            m20724c(activity, l, bool, i, i2, str, arrayList);
        }
        C2564c0.m36298b().m36286n("VPT_ENTER_ROOM_ANTI_SHAKE", currentTimeMillis);
    }

    /* renamed from: n */
    public final void m20713n(int i, Activity activity, long j, boolean z, String str, MinimizeEventEntity minimizeEventEntity, Boolean bool, int i2, String str2, ArrayList arrayList) {
        Integer num;
        C15916b.m5060d("进入房间-07");
        C15916b.m5059e("房间类型-roomType", Integer.valueOf(i));
        VptRoomActivityV1.C11909a.m13270b(VptRoomActivityV1.f24393G1, activity, j, z, str, minimizeEventEntity, bool, i2, false, str2, 128, null);
        if (arrayList != null) {
            num = Integer.valueOf(arrayList.size());
        } else {
            num = null;
        }
        System.out.println((Object) ("=====秒切====roomDetail=====" + num));
    }

    public /* synthetic */ C9192b(AbstractC14648g abstractC14648g) {
        this();
    }
}
