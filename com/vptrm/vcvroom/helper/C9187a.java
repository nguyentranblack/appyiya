package com.vptrm.vcvroom.helper;

import ad.AbstractC0132f;
import af.C0179i;
import af.EnumC0181j;
import af.InterfaceC0178h;
import androidx.fragment.app.FragmentActivity;
import bd.AbstractC2047a;
import com.blankj.utilcode.util.AbstractC2571f0;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.vptrm.common.app.CommonApp;
import com.vptrm.common.entity.LoginEntity;
import com.vptrm.common.entity.UserEntity;
import com.vptrm.common.helper.C8908l;
import com.vptrm.common.helper.C8923p;
import com.vptrm.vcvroom.R;
import com.vptrm.vcvroom.entity.StatusEntity;
import com.vptrm.vcvroom.page.dialog.HoNotEnoughDialog;
import id.C14028j;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC14648g;
import kotlin.jvm.internal.AbstractC14656n;
import kotlin.jvm.internal.AbstractC14657o;
import p397jf.InterfaceC14401a;
import p413kd.InterfaceC14536b;
import p612xd.C17594b;

/* renamed from: com.vptrm.vcvroom.helper.a */
/* loaded from: classes3.dex */
public final class C9187a {

    /* renamed from: a */
    public static final C9189b f20150a = new C9189b(null);

    /* renamed from: b */
    public static final InterfaceC0178h f20151b = C0179i.m38721a(EnumC0181j.f521a, C9188a.f20152a);

    /* renamed from: com.vptrm.vcvroom.helper.a$a */
    /* loaded from: classes3.dex */
    public static final class C9188a extends AbstractC14657o implements InterfaceC14401a {

        /* renamed from: a */
        public static final C9188a f20152a = new C9188a();

        public C9188a() {
            super(0);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // p397jf.InterfaceC14401a
        /* renamed from: b */
        public final C9187a invoke() {
            return new C9187a(null);
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.a$b */
    /* loaded from: classes3.dex */
    public static final class C9189b {
        public C9189b() {
        }

        /* renamed from: a */
        public final C9187a m20728a() {
            return (C9187a) C9187a.f20151b.getValue();
        }

        public /* synthetic */ C9189b(AbstractC14648g abstractC14648g) {
            this();
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.a$c */
    /* loaded from: classes3.dex */
    public static final class C9190c extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f20153a;

        public C9190c(InterfaceC14536b interfaceC14536b) {
            this.f20153a = interfaceC14536b;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(StatusEntity statusEntity) {
            if (statusEntity != null && statusEntity.getBlocked() == 1) {
                this.f20153a.onFailure(new Throwable(AbstractC2571f0.m36261b(R.string.user_is_blocked)));
            } else if (statusEntity != null && statusEntity.getDisturbStatus() == 10004) {
                this.f20153a.onFailure(new Throwable(AbstractC2571f0.m36261b(R.string.user_is_busy)));
            } else {
                this.f20153a.onSuccess(Boolean.TRUE);
            }
        }

        @Override // ad.AbstractC0132f
        public void onFail(String str, String str2) {
            this.f20153a.onFailure(new Throwable(str2));
        }
    }

    public C9187a() {
    }

    /* renamed from: g */
    public static final C9187a m20730g() {
        return f20150a.m20728a();
    }

    /* renamed from: b */
    public final void m20735b(FragmentActivity activity, UserEntity userEntity, InterfaceC14536b callback) {
        AbstractC14656n.m8377g(activity, "activity");
        AbstractC14656n.m8377g(userEntity, "userEntity");
        AbstractC14656n.m8377g(callback, "callback");
        m20734c(activity, userEntity, callback);
    }

    /* renamed from: c */
    public final void m20734c(FragmentActivity fragmentActivity, UserEntity userEntity, InterfaceC14536b interfaceC14536b) {
        try {
            LoginEntity loginEntity = C8923p.m21789e().m21787g();
            if (!CommonApp.f13679c) {
                AbstractC14656n.m8378f(loginEntity, "loginEntity");
                if (!AbstractC2047a.m37537f(loginEntity) && (!AbstractC2047a.m37534i(loginEntity) || !AbstractC2047a.m37540c(loginEntity, userEntity.getVideoPrice()))) {
                    HoNotEnoughDialog.f20731g.m19874a().show(fragmentActivity.getSupportFragmentManager(), "");
                    interfaceC14536b.onFailure(new Throwable());
                    return;
                }
            }
            AbstractC14656n.m8378f(loginEntity, "loginEntity");
            m20732e(loginEntity, userEntity, interfaceC14536b);
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public final void m20733d(long j, InterfaceC14536b interfaceC14536b) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("userId", Long.valueOf(j));
        C17594b.m685U(hashMap).compose(C14028j.m9195a()).subscribe(new C9190c(interfaceC14536b));
    }

    /* renamed from: e */
    public final void m20732e(LoginEntity loginEntity, UserEntity userEntity, InterfaceC14536b interfaceC14536b) {
        if (userEntity.getCallForwardingFlag() == 1) {
            interfaceC14536b.onSuccess(Boolean.TRUE);
            return;
        }
        int status = userEntity.getStatus();
        if (status != 1) {
            if (status != 2 && status != 3) {
                switch (status) {
                    case 10000:
                    case 10003:
                    case 10004:
                        break;
                    case 10001:
                    case UpdateDialogStatusCode.SHOW /* 10002 */:
                    case 10005:
                        break;
                    default:
                        return;
                }
            }
            interfaceC14536b.onFailure(new Throwable(AbstractC2571f0.m36261b(R.string.user_is_busy)));
            return;
        }
        if (AbstractC2047a.m37534i(loginEntity)) {
            m20733d(userEntity.getUserId(), interfaceC14536b);
        } else {
            m20731f(userEntity.getYxAccid(), interfaceC14536b);
        }
    }

    /* renamed from: f */
    public final void m20731f(String str, InterfaceC14536b interfaceC14536b) {
        if (System.currentTimeMillis() - C8908l.m21837a(str) < 120000) {
            interfaceC14536b.onFailure(new Throwable("Frequent operation, please try again later"));
        } else {
            interfaceC14536b.onSuccess(Boolean.TRUE);
        }
    }

    public /* synthetic */ C9187a(AbstractC14648g abstractC14648g) {
        this();
    }
}
