package com.vptrm.vcvroom.helper;

import ad.AbstractC0132f;
import af.C0179i;
import af.EnumC0181j;
import af.InterfaceC0178h;
import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.AbstractC2603r;
import com.blankj.utilcode.util.ToastUtils;
import com.vptrm.common.entity.GameJoyEntity;
import com.vptrm.common.helper.C8923p;
import com.vptrm.vcvroom.entity.VptHomeGameEntity;
import com.vptrm.vcvroom.page.dialog.room.RoomGameDialog;
import id.C14028j;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC14648g;
import kotlin.jvm.internal.AbstractC14656n;
import kotlin.jvm.internal.AbstractC14657o;
import p397jf.InterfaceC14401a;
import p413kd.InterfaceC14536b;
import p612xd.C17592a;
import p612xd.C17594b;

/* renamed from: com.vptrm.vcvroom.helper.x */
/* loaded from: classes3.dex */
public final class C9290x {

    /* renamed from: a */
    public static final C9292b f20320a = new C9292b(null);

    /* renamed from: b */
    public static final InterfaceC0178h f20321b = C0179i.m38721a(EnumC0181j.f521a, C9291a.f20322a);

    /* renamed from: com.vptrm.vcvroom.helper.x$a */
    /* loaded from: classes3.dex */
    public static final class C9291a extends AbstractC14657o implements InterfaceC14401a {

        /* renamed from: a */
        public static final C9291a f20322a = new C9291a();

        public C9291a() {
            super(0);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // p397jf.InterfaceC14401a
        /* renamed from: b */
        public final C9290x invoke() {
            return new C9290x(null);
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.x$b */
    /* loaded from: classes3.dex */
    public static final class C9292b {
        public C9292b() {
        }

        /* renamed from: a */
        public final C9290x m20502a() {
            return (C9290x) C9290x.f20321b.getValue();
        }

        public /* synthetic */ C9292b(AbstractC14648g abstractC14648g) {
            this();
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.x$c */
    /* loaded from: classes3.dex */
    public static final class C9293c extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f20323a;

        public C9293c(InterfaceC14536b interfaceC14536b) {
            this.f20323a = interfaceC14536b;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(ArrayList arrayList) {
            Integer num;
            if (arrayList != null) {
                num = Integer.valueOf(arrayList.size());
            } else {
                num = null;
            }
            AbstractC2603r.m36093i("房间内游戏列表：" + num);
            if (arrayList != null && arrayList.size() > 0) {
                this.f20323a.onSuccess(arrayList);
            }
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.x$d */
    /* loaded from: classes3.dex */
    public static final class C9294d extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ VptHomeGameEntity f20324a;

        /* renamed from: b */
        public final /* synthetic */ Activity f20325b;

        /* renamed from: c */
        public final /* synthetic */ FragmentManager f20326c;

        public C9294d(VptHomeGameEntity vptHomeGameEntity, Activity activity, FragmentManager fragmentManager) {
            this.f20324a = vptHomeGameEntity;
            this.f20325b = activity;
            this.f20326c = fragmentManager;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(GameJoyEntity gameJoyEntity) {
            String str;
            String str2;
            String str3;
            int i = 1;
            String str4 = null;
            if (gameJoyEntity != null) {
                str = gameJoyEntity.getToken();
            } else {
                str = null;
            }
            AbstractC2603r.m36093i("半屏游戏token:" + str);
            if (gameJoyEntity != null) {
                str2 = gameJoyEntity.getAppKey();
            } else {
                str2 = null;
            }
            AbstractC2603r.m36093i("半屏游戏key:" + str2);
            AbstractC2603r.m36093i("半屏游戏gameId:" + this.f20324a.getGameId());
            Activity activity = this.f20325b;
            if (activity != null) {
                VptHomeGameEntity vptHomeGameEntity = this.f20324a;
                FragmentManager fragmentManager = this.f20326c;
                if (!activity.isDestroyed() && !activity.isFinishing()) {
                    if (vptHomeGameEntity.getGameId() == 2) {
                        i = 2;
                    }
                    RoomGameDialog.C9997a c9997a = RoomGameDialog.f21565m;
                    if (gameJoyEntity != null) {
                        str3 = gameJoyEntity.getAppKey();
                    } else {
                        str3 = null;
                    }
                    if (gameJoyEntity != null) {
                        str4 = gameJoyEntity.getToken();
                    }
                    c9997a.m18687a(str3, str4, Integer.valueOf(vptHomeGameEntity.getGameId()), Integer.valueOf(i)).show(fragmentManager, "");
                }
            }
        }

        @Override // ad.AbstractC0132f
        public void onFail(String str, String str2) {
            if (str2 != null) {
                try {
                    if (str2.length() != 0) {
                        ToastUtils.m36346v(str2, new Object[0]);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.x$e */
    /* loaded from: classes3.dex */
    public static final class C9295e extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ Activity f20327a;

        /* renamed from: b */
        public final /* synthetic */ VptHomeGameEntity f20328b;

        /* renamed from: c */
        public final /* synthetic */ FragmentManager f20329c;

        public C9295e(Activity activity, VptHomeGameEntity vptHomeGameEntity, FragmentManager fragmentManager) {
            this.f20327a = activity;
            this.f20328b = vptHomeGameEntity;
            this.f20329c = fragmentManager;
        }

        /* JADX DEBUG: Method merged with bridge method */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #0 {Exception -> 0x003b, blocks: (B:3:0x001a, B:5:0x001e, B:7:0x0028, B:9:0x002e, B:11:0x0034, B:17:0x0041, B:19:0x0047, B:16:0x003d), top: B:23:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        @Override // ad.AbstractC0132f
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onSuccess(com.vptrm.common.entity.GameMangoEntity r6) {
            com.blankj.utilcode.util.AbstractC2603r.m36093i("Mango全屏游戏token:" + r6);
            try {
                android.app.Activity r0 = r5.f20327a;
                if (r0 != null) {
                    com.vptrm.vcvroom.entity.VptHomeGameEntity r1 = r5.f20328b;
                    androidx.fragment.app.FragmentManager r2 = r5.f20329c;
                    if (!r0.isDestroyed() && !r0.isFinishing()) {
                        java.lang.String r0 = r1.getHalfSkipUri();
                        if (r0 != null) {
                            if (r0.length() == 0) {
                            }
                            if (r2.isStateSaved()) {
                                com.vptrm.vcvroom.page.dialog.VptMangoHalfGameBottomDialog.C9739a r3 = com.vptrm.vcvroom.page.dialog.VptMangoHalfGameBottomDialog.f21196j;
                                kotlin.jvm.internal.AbstractC14656n.m8380d(r6);
                                java.lang.String r6 = r6.getToken();
                                kotlin.jvm.internal.AbstractC14656n.m8378f(r6, "ent!!.token");
                                kotlin.jvm.internal.AbstractC14656n.m8378f(r0, "url");
                                r3.m19265a(r6, r0, "game", r1.getGameId()).show(r2, "");
                                return;
                            }
                            return;
                        }
                        r0 = r1.getSkipUri();
                        if (r2.isStateSaved()) {
                        }
                    }
                }
            } catch (java.lang.Exception r6) {
                r6.printStackTrace();
            }
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String str) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            if (str != null) {
                try {
                    if (str.length() != 0) {
                        ToastUtils.m36346v(str, new Object[0]);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.x$f */
    /* loaded from: classes3.dex */
    public static final class C9296f extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ Activity f20330a;

        /* renamed from: b */
        public final /* synthetic */ VptHomeGameEntity f20331b;

        /* renamed from: c */
        public final /* synthetic */ boolean f20332c;

        /* renamed from: d */
        public final /* synthetic */ FragmentManager f20333d;

        public C9296f(Activity activity, VptHomeGameEntity vptHomeGameEntity, boolean z, FragmentManager fragmentManager) {
            this.f20330a = activity;
            this.f20331b = vptHomeGameEntity;
            this.f20332c = z;
            this.f20333d = fragmentManager;
        }

        /* JADX DEBUG: Method merged with bridge method */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[Catch: Exception -> 0x0040, TRY_LEAVE, TryCatch #0 {Exception -> 0x0040, blocks: (B:3:0x001a, B:5:0x001e, B:7:0x002a, B:9:0x0030, B:11:0x0036, B:19:0x0046, B:21:0x004c, B:18:0x0042), top: B:25:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        @Override // ad.AbstractC0132f
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onSuccess(com.vptrm.common.entity.GameMangoEntity r7) {
            com.blankj.utilcode.util.AbstractC2603r.m36093i("BoFu 全屏游戏token:" + r7);
            try {
                android.app.Activity r0 = r6.f20330a;
                if (r0 != null) {
                    com.vptrm.vcvroom.entity.VptHomeGameEntity r1 = r6.f20331b;
                    boolean r2 = r6.f20332c;
                    androidx.fragment.app.FragmentManager r3 = r6.f20333d;
                    if (!r0.isDestroyed() && !r0.isFinishing()) {
                        java.lang.String r0 = r1.getHalfSkipUri();
                        if (r0 != null) {
                            if (r0.length() != 0) {
                                if (r2) {
                                }
                                if (r3.isStateSaved()) {
                                    com.vptrm.vcvroom.page.game.BoFuGameDialog.C10217a r4 = com.vptrm.vcvroom.page.game.BoFuGameDialog.f21890j;
                                    kotlin.jvm.internal.AbstractC14656n.m8380d(r7);
                                    java.lang.String r7 = r7.getToken();
                                    kotlin.jvm.internal.AbstractC14656n.m8378f(r7, "ent!!.token");
                                    kotlin.jvm.internal.AbstractC14656n.m8378f(r0, "url");
                                    r4.m18304a(r7, r0, r1.getGameId(), r2).show(r3, "");
                                    return;
                                }
                                return;
                            }
                        }
                        r0 = r1.getSkipUri();
                        if (r3.isStateSaved()) {
                        }
                    }
                }
            } catch (java.lang.Exception r7) {
                r7.printStackTrace();
            }
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String str) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            if (str != null) {
                try {
                    if (str.length() != 0) {
                        ToastUtils.m36346v(str, new Object[0]);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.x$g */
    /* loaded from: classes3.dex */
    public static final class C9297g extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ Activity f20334a;

        /* renamed from: b */
        public final /* synthetic */ VptHomeGameEntity f20335b;

        /* renamed from: c */
        public final /* synthetic */ FragmentManager f20336c;

        public C9297g(Activity activity, VptHomeGameEntity vptHomeGameEntity, FragmentManager fragmentManager) {
            this.f20334a = activity;
            this.f20335b = vptHomeGameEntity;
            this.f20336c = fragmentManager;
        }

        /* JADX DEBUG: Method merged with bridge method */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #0 {Exception -> 0x003b, blocks: (B:3:0x001a, B:5:0x001e, B:7:0x0028, B:9:0x002e, B:11:0x0034, B:17:0x0041, B:19:0x0047, B:16:0x003d), top: B:23:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        @Override // ad.AbstractC0132f
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onSuccess(com.vptrm.common.entity.GameMangoEntity r6) {
            com.blankj.utilcode.util.AbstractC2603r.m36093i("Mango全屏游戏token:" + r6);
            try {
                android.app.Activity r0 = r5.f20334a;
                if (r0 != null) {
                    com.vptrm.vcvroom.entity.VptHomeGameEntity r1 = r5.f20335b;
                    androidx.fragment.app.FragmentManager r2 = r5.f20336c;
                    if (!r0.isDestroyed() && !r0.isFinishing()) {
                        java.lang.String r0 = r1.getHalfSkipUri();
                        if (r0 != null) {
                            if (r0.length() == 0) {
                            }
                            if (r2.isStateSaved()) {
                                com.vptrm.vcvroom.page.dialog.room.YiYLingXianGameBottomDialog.C10063a r3 = com.vptrm.vcvroom.page.dialog.room.YiYLingXianGameBottomDialog.f21689i;
                                kotlin.jvm.internal.AbstractC14656n.m8380d(r6);
                                java.lang.String r6 = r6.getToken();
                                kotlin.jvm.internal.AbstractC14656n.m8378f(r6, "ent!!.token");
                                kotlin.jvm.internal.AbstractC14656n.m8378f(r0, "url");
                                r3.m18466a(r6, r0, r1.getGameId()).show(r2, "");
                                return;
                            }
                            return;
                        }
                        r0 = r1.getSkipUri();
                        if (r2.isStateSaved()) {
                        }
                    }
                }
            } catch (java.lang.Exception r6) {
                r6.printStackTrace();
            }
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String str) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            if (str != null) {
                try {
                    if (str.length() != 0) {
                        ToastUtils.m36346v(str, new Object[0]);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public C9290x() {
    }

    /* renamed from: c */
    public static final C9290x m20508c() {
        return f20320a.m20502a();
    }

    /* renamed from: b */
    public final void m20509b(InterfaceC14536b callback) {
        AbstractC14656n.m8377g(callback, "callback");
        HashMap hashMap = new HashMap();
        hashMap.put("source", 2);
        C17594b.m711O3(hashMap).compose(C14028j.m9195a()).subscribe(new C9293c(callback));
    }

    /* renamed from: d */
    public final void m20507d(Activity activity, VptHomeGameEntity vptHomeGameEntity, FragmentManager supportFragmentManager) {
        AbstractC14656n.m8377g(vptHomeGameEntity, "vptHomeGameEntity");
        AbstractC14656n.m8377g(supportFragmentManager, "supportFragmentManager");
        HashMap hashMap = new HashMap();
        hashMap.put("gameId", Integer.valueOf(vptHomeGameEntity.getGameId()));
        hashMap.put("userId", Long.valueOf(C8923p.m21789e().m21787g().getId()));
        C17592a.m800m(hashMap).compose(C14028j.m9195a()).subscribe(new C9294d(vptHomeGameEntity, activity, supportFragmentManager));
    }

    /* renamed from: e */
    public final void m20506e(Activity activity, VptHomeGameEntity vptHomeGameEntity, FragmentManager supportFragmentManager) {
        AbstractC14656n.m8377g(vptHomeGameEntity, "vptHomeGameEntity");
        AbstractC14656n.m8377g(supportFragmentManager, "supportFragmentManager");
        HashMap hashMap = new HashMap();
        hashMap.put("companyId", Integer.valueOf(EnumC9200d.MANGO.getCode()));
        hashMap.put("gameId", Integer.valueOf(vptHomeGameEntity.getGameId()));
        hashMap.put("userId", Long.valueOf(C8923p.m21789e().m21787g().getId()));
        C17592a.m814I(hashMap).compose(C14028j.m9195a()).subscribe(new C9295e(activity, vptHomeGameEntity, supportFragmentManager));
    }

    /* renamed from: f */
    public final void m20505f(Activity activity, VptHomeGameEntity vptHomeGameEntity, FragmentManager supportFragmentManager, boolean z) {
        AbstractC14656n.m8377g(vptHomeGameEntity, "vptHomeGameEntity");
        AbstractC14656n.m8377g(supportFragmentManager, "supportFragmentManager");
        HashMap hashMap = new HashMap();
        hashMap.put("gameId", Integer.valueOf(vptHomeGameEntity.getGameId()));
        C17592a.m793t(hashMap).compose(C14028j.m9195a()).subscribe(new C9296f(activity, vptHomeGameEntity, z, supportFragmentManager));
    }

    /* renamed from: g */
    public final void m20504g(Activity activity, VptHomeGameEntity vptHomeGameEntity, FragmentManager supportFragmentManager) {
        AbstractC14656n.m8377g(vptHomeGameEntity, "vptHomeGameEntity");
        AbstractC14656n.m8377g(supportFragmentManager, "supportFragmentManager");
        HashMap hashMap = new HashMap();
        hashMap.put("gameId", Integer.valueOf(vptHomeGameEntity.getGameId()));
        C17592a.m792u(hashMap).compose(C14028j.m9195a()).subscribe(new C9297g(activity, vptHomeGameEntity, supportFragmentManager));
    }

    public /* synthetic */ C9290x(AbstractC14648g abstractC14648g) {
        this();
    }
}
