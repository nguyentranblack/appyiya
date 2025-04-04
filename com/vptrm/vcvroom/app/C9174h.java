package com.vptrm.vcvroom.app;

import android.app.Application;
import android.content.Context;
import com.blankj.utilcode.util.AbstractC2565d;
import com.blankj.utilcode.util.AbstractC2571f0;
import com.blankj.utilcode.util.AbstractC2572g;
import com.blankj.utilcode.util.AbstractC2584j;
import com.blankj.utilcode.util.AbstractC2603r;
import com.blankj.utilcode.util.C2564c0;
import com.netease.nim.uikit.api.NimUIKit;
import com.netease.nim.uikit.api.UIKitOptions;
import com.netease.nimlib.sdk.NIMClient;
import com.netease.nimlib.sdk.Observer;
import com.netease.nimlib.sdk.auth.LoginInfo;
import com.netease.nimlib.sdk.lifecycle.SdkLifecycleObserver;
import com.netease.nimlib.sdk.util.NIMUtil;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.MaterialHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.tencent.bugly.crashreport.CrashReport;
import com.vptrm.common.entity.LoginEntity;
import com.vptrm.common.helper.C8923p;
import com.vptrm.common.helper.C8936u;
import com.vptrm.common.utils.C9002p;
import com.vptrm.library.app.LibApp;
import com.vptrm.vcvroom.R;
import com.vptrm.vcvroom.netease.C9300a;
import com.vptrm.vcvroom.session.SessionHelper;
import mc.InterfaceC15274b;
import mc.InterfaceC15275c;
import p395jc.InterfaceC14386c;
import p395jc.InterfaceC14387d;
import p395jc.InterfaceC14389f;
import p455nd.C15470e;
import p486p8.C15906g;
import p490pd.C15916b;
import p564ud.C16841a;
import p594wc.C17195a;
import p611xc.C17589c;

/* renamed from: com.vptrm.vcvroom.app.h */
/* loaded from: classes3.dex */
public class C9174h {

    /* renamed from: a */
    public static boolean f14461a = false;

    /* renamed from: com.vptrm.vcvroom.app.h$a */
    /* loaded from: classes3.dex */
    public class C9175a implements Observer {
        @Override // com.netease.nimlib.sdk.Observer
        /* renamed from: a */
        public void onEvent(Boolean bool) {
            if (bool != null && bool.booleanValue()) {
                C15916b.m5060d("云信初始化成功");
                C9002p.f13972a.m21594c();
            }
        }
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.app.g.a(android.content.Context, jc.f):jc.c] */
    /* renamed from: a */
    public static /* synthetic */ InterfaceC14386c m21046a(Context context, InterfaceC14389f interfaceC14389f) {
        return m21036k(context, interfaceC14389f);
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.app.f.a(android.content.Context, jc.f):jc.d] */
    /* renamed from: b */
    public static /* synthetic */ InterfaceC14387d m21045b(Context context, InterfaceC14389f interfaceC14389f) {
        return m21037j(context, interfaceC14389f);
    }

    /* renamed from: c */
    public static LoginInfo m21044c() {
        String m36292h = C2564c0.m36298b().m36292h("VPT_SP_APP_YXACCID_INFO", "");
        String m36292h2 = C2564c0.m36298b().m36292h("VPT_SP_APP_YX_TOKEN_WY_INFO", "");
        if (!AbstractC2571f0.m36259d(m36292h)) {
            NimUIKit.setAccount(m36292h);
            return new LoginInfo(m36292h, m36292h2);
        }
        return null;
    }

    /* renamed from: d */
    public static UIKitOptions m21043d(Context context) {
        UIKitOptions uIKitOptions = new UIKitOptions();
        uIKitOptions.appCacheDir = C9300a.m20495b(context) + "/nim";
        uIKitOptions.messageLeftBackground = R.drawable.message_item_left_selector;
        uIKitOptions.messageRightBackground = R.drawable.message_item_right_selector;
        return uIKitOptions;
    }

    /* renamed from: e */
    public static void m21042e(Application application) {
        m21041f();
        m21038i();
        m21040g();
        m21039h(application);
        m21035l(application);
        CrashReport.UserStrategy userStrategy = new CrashReport.UserStrategy(application);
        try {
            userStrategy.setAppChannel(C15470e.m6350a(LibApp.m21481a()));
            userStrategy.setDeviceID(AbstractC2584j.m36231d());
            userStrategy.setAppVersion(AbstractC2565d.m36273d());
            if (C8923p.m21789e().m21787g() != null) {
                CrashReport.putUserData(application, "userId", C8923p.m21789e().m21787g().getId() + "");
                CrashReport.putUserData(application, "userNickname", C8923p.m21789e().m21787g().getNickname());
            }
        } catch (Exception e) {
            AbstractC2603r.m36091k("CrashReport strategy error:" + e.toString());
        }
        CrashReport.initCrashReport(application, C17195a.m1802b(), false, userStrategy);
        try {
            LoginEntity m21787g = C8923p.m21789e().m21787g();
            if (m21787g != null) {
                C15906g m5108a = C15906g.m5108a();
                m5108a.m5105d(m21787g.getId() + "");
                C15906g m5108a2 = C15906g.m5108a();
                m5108a2.m5106c("run_env", "RELEASE");
                m5108a2.m5106c("user_id", m21787g.getId() + "");
                m5108a2.m5106c("user_nickname", m21787g.getNickname());
                m5108a2.m5106c("run_version", AbstractC2565d.m36273d());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        C2564c0.m36298b().m36280t("SP_KEY_SHPW_SPECIAL_RECHARGE_FIRST", true);
        C2564c0.m36298b().m36280t("SP_KEY_RELOAD_ROOM_INDEX", true);
    }

    /* renamed from: f */
    public static void m21041f() {
        C17589c.m825a().m823c(new C16841a());
    }

    /* renamed from: g */
    public static void m21040g() {
    }

    /* renamed from: h */
    public static void m21039h(Application application) {
        Context applicationContext = application.getApplicationContext();
        m21044c();
        if (NIMUtil.isMainProcess(applicationContext)) {
            NIMClient.init(applicationContext, null, C9300a.m20494c(applicationContext));
            NimUIKit.init(applicationContext, m21043d(applicationContext));
            C8936u.m21766d().m21765e(true);
            SessionHelper.init();
            ((SdkLifecycleObserver) NIMClient.getService(SdkLifecycleObserver.class)).observeMainProcessInitCompleteResult(new C9175a(), true);
        }
    }

    /* renamed from: i */
    public static void m21038i() {
        SmartRefreshLayout.setDefaultRefreshHeaderCreator(new InterfaceC15275c() { // from class: com.vptrm.vcvroom.app.f
            @Override // mc.InterfaceC15275c
            /* renamed from: a */
            public final InterfaceC14387d mo6739a(Context context, InterfaceC14389f interfaceC14389f) {
                return C9174h.m21045b(context, interfaceC14389f);
            }
        });
        SmartRefreshLayout.setDefaultRefreshFooterCreator(new InterfaceC15274b() { // from class: com.vptrm.vcvroom.app.g
            @Override // mc.InterfaceC15274b
            /* renamed from: a */
            public final InterfaceC14386c mo6740a(Context context, InterfaceC14389f interfaceC14389f) {
                return C9174h.m21046a(context, interfaceC14389f);
            }
        });
    }

    /* renamed from: j */
    public static /* synthetic */ InterfaceC14387d m21037j(Context context, InterfaceC14389f interfaceC14389f) {
        MaterialHeader materialHeader = new MaterialHeader(context);
        materialHeader.m22599j(AbstractC2572g.m36257a(R.color.color_763AFF));
        return materialHeader;
    }

    /* renamed from: k */
    public static /* synthetic */ InterfaceC14386c m21036k(Context context, InterfaceC14389f interfaceC14389f) {
        return (InterfaceC14386c) new ClassicsFooter(context).m22601l(20.0f);
    }

    /* renamed from: l */
    public static void m21035l(Application application) {
        application.registerActivityLifecycleCallbacks(new C9163c());
        application.registerActivityLifecycleCallbacks(new C9161b());
    }
}
