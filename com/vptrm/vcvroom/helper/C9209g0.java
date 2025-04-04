package com.vptrm.vcvroom.helper;

import ad.AbstractC0132f;
import af.AbstractC0189p;
import af.C0172e0;
import af.C0179i;
import af.EnumC0181j;
import af.InterfaceC0178h;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.blankj.utilcode.util.AbstractC2579h;
import com.blankj.utilcode.util.AbstractC2603r;
import com.google.android.exoplayer2.ExoPlayer;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.netease.nim.uikit.common.util.sys.ScreenUtil;
import com.vptrm.common.app.CommonApp;
import com.vptrm.common.entity.VptMicEmojiEntity;
import com.vptrm.common.utils.C8976d;
import com.vptrm.common.utils.C9017t;
import com.vptrm.library.entity.RoomChatGiftEntity;
import com.vptrm.library.utils.ImageLoader;
import com.vptrm.vcvroom.R;
import com.vptrm.vcvroom.app.C9166e;
import com.vptrm.vcvroom.entity.CloseMicEntity;
import com.vptrm.vcvroom.entity.RoomChatSeatDetailDTO;
import com.vptrm.vcvroom.entity.RoomInfoEntity;
import com.vptrm.vcvroom.entity.RoomUserStateEntity;
import com.vptrm.vcvroom.entity.RoomWordSensitiveEnrity;
import com.vptrm.vcvroom.entity.SearchRoomResultEntity;
import com.vptrm.vcvroom.entity.VptCreatePkGameEntity;
import com.vptrm.vcvroom.entity.VptInRoomUserEntity;
import com.vptrm.vcvroom.entity.VptRoomGameLuckyEntity;
import com.vptrm.vcvroom.widget.VoiceBitView;
import id.C14028j;
import io.agora.rtc2.RtcEngine;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlin.collections.C14592q;
import kotlin.coroutines.InterfaceC14612d;
import kotlin.coroutines.intrinsics.C14630c;
import kotlin.jvm.internal.AbstractC14648g;
import kotlin.jvm.internal.AbstractC14656n;
import kotlin.jvm.internal.AbstractC14657o;
import kotlin.jvm.internal.C14640c0;
import kotlin.text.C14721u;
import kotlinx.coroutines.AbstractC14805f0;
import kotlinx.coroutines.AbstractC14857h;
import kotlinx.coroutines.AbstractC14932o0;
import kotlinx.coroutines.C14980t0;
import kotlinx.coroutines.InterfaceC14801e0;
import kotlinx.coroutines.InterfaceC14919l1;
import p296df.AbstractC13346l;
import p397jf.InterfaceC14401a;
import p397jf.InterfaceC14412l;
import p397jf.InterfaceC14416p;
import p413kd.InterfaceC14536b;
import p455nd.AbstractC15473g;
import p612xd.C17594b;

/* renamed from: com.vptrm.vcvroom.helper.g0 */
/* loaded from: classes3.dex */
public final class C9209g0 {

    /* renamed from: d */
    public static final C9211b f20214d = new C9211b(null);

    /* renamed from: e */
    public static final InterfaceC0178h f20215e = C0179i.m38721a(EnumC0181j.f521a, C9210a.f20219a);

    /* renamed from: a */
    public final Stack f20216a;

    /* renamed from: b */
    public final int f20217b;

    /* renamed from: c */
    public InterfaceC14919l1 f20218c;

    /* renamed from: com.vptrm.vcvroom.helper.g0$a */
    /* loaded from: classes3.dex */
    public static final class C9210a extends AbstractC14657o implements InterfaceC14401a {

        /* renamed from: a */
        public static final C9210a f20219a = new C9210a();

        public C9210a() {
            super(0);
        }

        @Override // p397jf.InterfaceC14401a
        /* renamed from: b */
        public final C9209g0 invoke() {
            return new C9209g0(null);
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$b */
    /* loaded from: classes3.dex */
    public static final class C9211b {
        public C9211b() {
        }

        /* renamed from: a */
        public final C9209g0 m20647a() {
            return (C9209g0) C9209g0.f20215e.getValue();
        }

        public /* synthetic */ C9211b(AbstractC14648g abstractC14648g) {
            this();
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$c */
    /* loaded from: classes3.dex */
    public static final class C9212c extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f20220a;

        public C9212c(InterfaceC14536b interfaceC14536b) {
            this.f20220a = interfaceC14536b;
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
            AbstractC2603r.m36093i("onFail");
            InterfaceC14536b interfaceC14536b = this.f20220a;
            if (interfaceC14536b != null) {
                interfaceC14536b.onSuccess(Boolean.FALSE);
            }
        }

        @Override // ad.AbstractC0132f
        public void onSuccess(Void r2) {
            InterfaceC14536b interfaceC14536b = this.f20220a;
            if (interfaceC14536b != null) {
                interfaceC14536b.onSuccess(Boolean.TRUE);
            }
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$d */
    /* loaded from: classes3.dex */
    public static final class C9213d extends AbstractC0132f {
        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(CloseMicEntity closeMicEntity) {
        }

        @Override // ad.AbstractC0132f
        public void onFail(String str, String str2) {
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$e */
    /* loaded from: classes3.dex */
    public static final class C9214e extends AbstractC14657o implements InterfaceC14412l {

        /* renamed from: a */
        public static final C9214e f20221a = new C9214e();

        public C9214e() {
            super(1);
        }

        /* renamed from: b */
        public final void m20645b(List list) {
            try {
                int size = list.size();
                AbstractC2603r.m36093i("麦位表情服务器数量：" + size);
                CommonApp.f13699w.clear();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    VptMicEmojiEntity vptMicEmojiEntity = (VptMicEmojiEntity) it.next();
                    CommonApp.f13699w.put(Integer.valueOf(vptMicEmojiEntity.getId()), vptMicEmojiEntity);
                }
                int size2 = CommonApp.f13699w.size();
                AbstractC2603r.m36093i("麦位表情本地记载数量：" + size2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // p397jf.InterfaceC14412l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m20645b((List) obj);
            return C0172e0.f512a;
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$f */
    /* loaded from: classes3.dex */
    public static final class C9215f extends AbstractC14657o implements InterfaceC14412l {

        /* renamed from: a */
        public static final C9215f f20222a = new C9215f();

        public C9215f() {
            super(1);
        }

        @Override // p397jf.InterfaceC14412l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C0172e0.f512a;
        }

        public final void invoke(Throwable th) {
            AbstractC2603r.m36093i("----error:" + th);
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$g */
    /* loaded from: classes3.dex */
    public static final class C9216g extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f20223a;

        public C9216g(InterfaceC14536b interfaceC14536b) {
            this.f20223a = interfaceC14536b;
        }

        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(VptRoomGameLuckyEntity vptRoomGameLuckyEntity) {
            this.f20223a.onSuccess(vptRoomGameLuckyEntity);
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$h */
    /* loaded from: classes3.dex */
    public static final class C9217h extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f20224a;

        public C9217h(InterfaceC14536b interfaceC14536b) {
            this.f20224a = interfaceC14536b;
        }

        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(VptRoomGameLuckyEntity vptRoomGameLuckyEntity) {
            this.f20224a.onSuccess(vptRoomGameLuckyEntity);
        }

        @Override // ad.AbstractC0132f, io.reactivex.Observer
        public void onComplete() {
            super.onComplete();
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$i */
    /* loaded from: classes3.dex */
    public static final class C9218i extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f20225a;

        public C9218i(InterfaceC14536b interfaceC14536b) {
            this.f20225a = interfaceC14536b;
        }

        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(ArrayList arrayList) {
            if (arrayList != null) {
                this.f20225a.onSuccess(arrayList);
            }
        }

        @Override // ad.AbstractC0132f, io.reactivex.Observer
        public void onComplete() {
            super.onComplete();
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$j */
    /* loaded from: classes3.dex */
    public static final class C9219j extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f20226a;

        public C9219j(InterfaceC14536b interfaceC14536b) {
            this.f20226a = interfaceC14536b;
        }

        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(VptRoomGameLuckyEntity vptRoomGameLuckyEntity) {
            this.f20226a.onSuccess(vptRoomGameLuckyEntity);
        }

        @Override // ad.AbstractC0132f, io.reactivex.Observer
        public void onComplete() {
            super.onComplete();
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$k */
    /* loaded from: classes3.dex */
    public static final class C9220k extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f20227a;

        public C9220k(InterfaceC14536b interfaceC14536b) {
            this.f20227a = interfaceC14536b;
        }

        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(RoomUserStateEntity roomUserStateEntity) {
            if (roomUserStateEntity != null) {
                this.f20227a.onSuccess(roomUserStateEntity);
            }
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$l */
    /* loaded from: classes3.dex */
    public static final class C9221l extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ Long f20228a;

        public C9221l(Long l) {
            this.f20228a = l;
        }

        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(String str) {
            if (str != null) {
                Long l = this.f20228a;
                C9166e.C9167a c9167a = C9166e.f14400d0;
                RoomInfoEntity m21156D = c9167a.m21050a().m21156D();
                if (m21156D != null && AbstractC14656n.m8382b(m21156D.getId(), l)) {
                    RoomInfoEntity m21156D2 = c9167a.m21050a().m21156D();
                    if (m21156D2 != null) {
                        m21156D2.setAgoraToken(str);
                    }
                    RtcEngine m21558i = C9017t.f13980g.m21550a().m21558i();
                    if (m21558i != null) {
                        m21558i.renewToken(str);
                    }
                }
            }
        }

        @Override // ad.AbstractC0132f
        public void onFail(String str, String str2) {
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$m */
    /* loaded from: classes3.dex */
    public static final class C9222m extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f20229a;

        public C9222m(InterfaceC14536b interfaceC14536b) {
            this.f20229a = interfaceC14536b;
        }

        @Override // ad.AbstractC0132f
        public void onFail(String str, String str2) {
        }

        @Override // ad.AbstractC0132f
        public void onSuccess(Void r2) {
            this.f20229a.onSuccess(Boolean.TRUE);
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$n */
    /* loaded from: classes3.dex */
    public static final class C9223n extends AbstractC13346l implements InterfaceC14416p {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ int $batchSize;
        final /* synthetic */ long $delayMillis;
        final /* synthetic */ FrameLayout $flFullView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9223n(int i, long j, Activity activity, FrameLayout frameLayout, InterfaceC14612d interfaceC14612d) {
            super(2, interfaceC14612d);
            C9209g0.this = r1;
            this.$batchSize = i;
            this.$delayMillis = j;
            this.$activity = activity;
            this.$flFullView = frameLayout;
        }

        @Override // p296df.AbstractC13334a
        public final InterfaceC14612d create(Object obj, InterfaceC14612d interfaceC14612d) {
            return new C9223n(this.$batchSize, this.$delayMillis, this.$activity, this.$flFullView, interfaceC14612d);
        }

        @Override // p296df.AbstractC13334a
        public final Object invokeSuspend(Object obj) {
            Object m8425c = C14630c.m8425c();
            int i = this.label;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0189p.m38710b(obj);
            while (C9209g0.this.f20216a.size() < C9209g0.this.f20217b) {
                int i2 = this.$batchSize;
                C9209g0 c9209g0 = C9209g0.this;
                Activity activity = this.$activity;
                FrameLayout frameLayout = this.$flFullView;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (c9209g0.f20216a.size() < c9209g0.f20217b) {
                        View m20697B = c9209g0.m20697B(activity);
                        c9209g0.m20658q(m20697B, frameLayout);
                        c9209g0.f20216a.push(m20697B);
                    } else {
                        return C0172e0.f512a;
                    }
                }
                long j = this.$delayMillis;
                this.label = 1;
                if (AbstractC14932o0.m7747a(j, this) == m8425c) {
                    return m8425c;
                }
            }
            return C0172e0.f512a;
        }

        @Override // p397jf.InterfaceC14416p
        /* renamed from: invoke */
        public final Object mo39315invoke(InterfaceC14801e0 interfaceC14801e0, InterfaceC14612d interfaceC14612d) {
            return ((C9223n) create(interfaceC14801e0, interfaceC14612d)).invokeSuspend(C0172e0.f512a);
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$o */
    /* loaded from: classes3.dex */
    public static final class C9224o extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f20230a;

        public C9224o(InterfaceC14536b interfaceC14536b) {
            this.f20230a = interfaceC14536b;
        }

        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(VptCreatePkGameEntity vptCreatePkGameEntity) {
            this.f20230a.onSuccess(vptCreatePkGameEntity);
        }

        @Override // ad.AbstractC0132f, io.reactivex.Observer
        public void onComplete() {
            super.onComplete();
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$p */
    /* loaded from: classes3.dex */
    public static final class C9225p extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f20231a;

        public C9225p(InterfaceC14536b interfaceC14536b) {
            this.f20231a = interfaceC14536b;
        }

        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(SearchRoomResultEntity searchRoomResultEntity) {
            if (searchRoomResultEntity != null) {
                InterfaceC14536b interfaceC14536b = this.f20231a;
                if (searchRoomResultEntity.getRoomType() == 1 && interfaceC14536b != null) {
                    interfaceC14536b.onSuccess(Boolean.TRUE);
                }
            }
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$q */
    /* loaded from: classes3.dex */
    public static final class C9226q extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f20232a;

        public C9226q(InterfaceC14536b interfaceC14536b) {
            this.f20232a = interfaceC14536b;
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
            AbstractC2603r.m36093i("onFail");
            InterfaceC14536b interfaceC14536b = this.f20232a;
            if (interfaceC14536b != null) {
                interfaceC14536b.onSuccess(Boolean.FALSE);
            }
        }

        @Override // ad.AbstractC0132f
        public void onSuccess(Void r2) {
            InterfaceC14536b interfaceC14536b = this.f20232a;
            if (interfaceC14536b != null) {
                interfaceC14536b.onSuccess(Boolean.TRUE);
            }
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$r */
    /* loaded from: classes3.dex */
    public static final class C9227r extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f20233a;

        public C9227r(InterfaceC14536b interfaceC14536b) {
            this.f20233a = interfaceC14536b;
        }

        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(ArrayList arrayList) {
            if (arrayList != null) {
                this.f20233a.onSuccess(arrayList);
            }
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$s */
    /* loaded from: classes3.dex */
    public static final class C9228s extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f20234a;

        public C9228s(InterfaceC14536b interfaceC14536b) {
            this.f20234a = interfaceC14536b;
        }

        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(VptRoomGameLuckyEntity vptRoomGameLuckyEntity) {
            this.f20234a.onSuccess(vptRoomGameLuckyEntity);
        }

        @Override // ad.AbstractC0132f, io.reactivex.Observer
        public void onComplete() {
            super.onComplete();
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$t */
    /* loaded from: classes3.dex */
    public static final class C9229t extends AbstractC0132f {
        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(RoomWordSensitiveEnrity roomWordSensitiveEnrity) {
            if (roomWordSensitiveEnrity != null && roomWordSensitiveEnrity.getSensitiveWords() != null) {
                String sensitiveWords = roomWordSensitiveEnrity.getSensitiveWords();
                AbstractC14656n.m8378f(sensitiveWords, "ent.sensitiveWords");
                List m8201t0 = C14721u.m8201t0(sensitiveWords, new String[]{HiAnalyticsConstant.REPORT_VAL_SEPARATOR}, false, 0, 6, null);
                if (!m8201t0.isEmpty()) {
                    CommonApp.f13701y.clear();
                    CommonApp.f13701y = m8201t0;
                }
            }
        }

        @Override // ad.AbstractC0132f
        public void onFail(String str, String str2) {
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$u */
    /* loaded from: classes3.dex */
    public static final class C9230u implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ ValueAnimator f20235a;

        /* renamed from: b */
        public final /* synthetic */ C9209g0 f20236b;

        /* renamed from: c */
        public final /* synthetic */ C14640c0 f20237c;

        public C9230u(ValueAnimator valueAnimator, C9209g0 c9209g0, C14640c0 c14640c0) {
            this.f20235a = valueAnimator;
            this.f20236b = c9209g0;
            this.f20237c = c14640c0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            AbstractC14656n.m8377g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            AbstractC14656n.m8377g(animation, "animation");
            this.f20235a.cancel();
            this.f20236b.m20656s((View) this.f20237c.element);
            this.f20236b.f20216a.push(this.f20237c.element);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            AbstractC14656n.m8377g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            AbstractC14656n.m8377g(animation, "animation");
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$v */
    /* loaded from: classes3.dex */
    public static final class C9231v implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ ValueAnimator f20238a;

        /* renamed from: b */
        public final /* synthetic */ C9209g0 f20239b;

        /* renamed from: c */
        public final /* synthetic */ C14640c0 f20240c;

        public C9231v(ValueAnimator valueAnimator, C9209g0 c9209g0, C14640c0 c14640c0) {
            this.f20238a = valueAnimator;
            this.f20239b = c9209g0;
            this.f20240c = c14640c0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            AbstractC14656n.m8377g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            AbstractC14656n.m8377g(animation, "animation");
            this.f20238a.cancel();
            this.f20239b.m20656s((View) this.f20240c.element);
            this.f20239b.f20216a.push(this.f20240c.element);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            AbstractC14656n.m8377g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            AbstractC14656n.m8377g(animation, "animation");
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.g0$w */
    /* loaded from: classes3.dex */
    public static final class C9232w implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ ValueAnimator f20241a;

        /* renamed from: b */
        public final /* synthetic */ C14640c0 f20242b;

        /* renamed from: c */
        public final /* synthetic */ C9209g0 f20243c;

        public C9232w(ValueAnimator valueAnimator, C14640c0 c14640c0, C9209g0 c9209g0) {
            this.f20241a = valueAnimator;
            this.f20242b = c14640c0;
            this.f20243c = c9209g0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            AbstractC14656n.m8377g(animation, "animation");
            System.out.println((Object) "===送礼动画结束====onAnimationCancel=====");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            AbstractC14656n.m8377g(animation, "animation");
            this.f20241a.cancel();
            View view = (View) this.f20242b.element;
            if (view != null) {
                view.setVisibility(8);
            }
            this.f20243c.m20656s((View) this.f20242b.element);
            this.f20243c.f20216a.push(this.f20242b.element);
            System.out.println((Object) "===送礼动画结束====onAnimationEnd=====");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            AbstractC14656n.m8377g(animation, "animation");
            System.out.println((Object) "===送礼动画结束====onAnimationEnd=====");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            AbstractC14656n.m8377g(animation, "animation");
        }
    }

    public /* synthetic */ C9209g0(AbstractC14648g abstractC14648g) {
        this();
    }

    /* renamed from: J */
    public static /* synthetic */ void m20689J(C9209g0 c9209g0, long j, InterfaceC14536b interfaceC14536b, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC14536b = null;
        }
        c9209g0.m20690I(j, interfaceC14536b);
    }

    /* renamed from: P */
    public static /* synthetic */ void m20683P(C9209g0 c9209g0, Activity activity, Handler handler, FrameLayout frameLayout, ArrayList arrayList, RoomInfoEntity roomInfoEntity, long j, String str, ImageView imageView, RoomChatSeatDetailDTO roomChatSeatDetailDTO, LinearLayout linearLayout, int i, int i2, Object obj) {
        int i3;
        if ((i2 & 1024) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        c9209g0.m20684O(activity, handler, frameLayout, arrayList, roomInfoEntity, j, str, imageView, roomChatSeatDetailDTO, linearLayout, i3);
    }

    /* renamed from: Q */
    public static final void m20682Q(FrameLayout flFullView, final C14640c0 aniLineIv, C14640c0 micPosition, C9209g0 this$0) {
        AbstractC14656n.m8377g(flFullView, "$flFullView");
        AbstractC14656n.m8377g(aniLineIv, "$aniLineIv");
        AbstractC14656n.m8377g(micPosition, "$micPosition");
        AbstractC14656n.m8377g(this$0, "this$0");
        final PointF pointF = new PointF((flFullView.getWidth() / 2.0f) - (((View) aniLineIv.element).getWidth() / 2.0f), (flFullView.getHeight() / 2.0f) + AbstractC15473g.m6343a(100.0f));
        float f = pointF.x;
        Object obj = micPosition.element;
        final PointF pointF2 = new PointF((f + ((PointF) obj).x) / 2, ((PointF) obj).y - 400.0f);
        final PointF pointF3 = (PointF) micPosition.element;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.vptrm.vcvroom.helper.f0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9209g0.m20668g(pointF, pointF2, pointF3, aniLineIv, valueAnimator);
            }
        });
        ofFloat.addListener(new C9230u(ofFloat, this$0, aniLineIv));
        ofFloat.start();
    }

    /* renamed from: R */
    public static final void m20681R(PointF startPoint, PointF controlPoint, PointF endPoint, C14640c0 aniLineIv, ValueAnimator animation) {
        AbstractC14656n.m8377g(startPoint, "$startPoint");
        AbstractC14656n.m8377g(controlPoint, "$controlPoint");
        AbstractC14656n.m8377g(endPoint, "$endPoint");
        AbstractC14656n.m8377g(aniLineIv, "$aniLineIv");
        AbstractC14656n.m8377g(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        AbstractC14656n.m8379e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        PointF m21633a = C8976d.m21633a(((Float) animatedValue).floatValue(), startPoint, controlPoint, endPoint);
        ((View) aniLineIv.element).setVisibility(0);
        ((View) aniLineIv.element).setX(m21633a.x);
        ((View) aniLineIv.element).setY(m21633a.y);
    }

    /* renamed from: S */
    public static final void m20680S(FrameLayout flFullView, final C14640c0 aniLineIv, C14640c0 micPosition, C9209g0 this$0) {
        AbstractC14656n.m8377g(flFullView, "$flFullView");
        AbstractC14656n.m8377g(aniLineIv, "$aniLineIv");
        AbstractC14656n.m8377g(micPosition, "$micPosition");
        AbstractC14656n.m8377g(this$0, "this$0");
        final PointF pointF = new PointF((flFullView.getWidth() / 2.0f) - (((View) aniLineIv.element).getWidth() / 2.0f), (flFullView.getHeight() / 2.0f) + AbstractC15473g.m6343a(100.0f));
        float f = pointF.x;
        Object obj = micPosition.element;
        final PointF pointF2 = new PointF((f + ((PointF) obj).x) / 2, ((PointF) obj).y - 400.0f);
        final PointF pointF3 = (PointF) micPosition.element;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.vptrm.vcvroom.helper.e0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9209g0.m20674a(pointF, pointF2, pointF3, aniLineIv, valueAnimator);
            }
        });
        ofFloat.addListener(new C9231v(ofFloat, this$0, aniLineIv));
        ofFloat.start();
    }

    /* renamed from: T */
    public static final void m20679T(PointF startPoint, PointF controlPoint, PointF endPoint, C14640c0 aniLineIv, ValueAnimator animation) {
        AbstractC14656n.m8377g(startPoint, "$startPoint");
        AbstractC14656n.m8377g(controlPoint, "$controlPoint");
        AbstractC14656n.m8377g(endPoint, "$endPoint");
        AbstractC14656n.m8377g(aniLineIv, "$aniLineIv");
        AbstractC14656n.m8377g(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        AbstractC14656n.m8379e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        PointF m21633a = C8976d.m21633a(((Float) animatedValue).floatValue(), startPoint, controlPoint, endPoint);
        ((View) aniLineIv.element).setVisibility(0);
        ((View) aniLineIv.element).setX(m21633a.x);
        ((View) aniLineIv.element).setY(m21633a.y);
    }

    /* renamed from: V */
    public static final void m20677V(FrameLayout flFullView, final C14640c0 aniLineIv, C14640c0 micPosition, C9209g0 this$0) {
        AbstractC14656n.m8377g(flFullView, "$flFullView");
        AbstractC14656n.m8377g(aniLineIv, "$aniLineIv");
        AbstractC14656n.m8377g(micPosition, "$micPosition");
        AbstractC14656n.m8377g(this$0, "this$0");
        final PointF pointF = new PointF((flFullView.getWidth() / 2.0f) - (((View) aniLineIv.element).getWidth() / 2.0f), (flFullView.getHeight() / 2.0f) + AbstractC15473g.m6343a(100.0f));
        float f = pointF.x;
        Object obj = micPosition.element;
        final PointF pointF2 = new PointF((f + ((PointF) obj).x) / 2, ((PointF) obj).y - 400.0f);
        final PointF pointF3 = (PointF) micPosition.element;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.vptrm.vcvroom.helper.b0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9209g0.m20671d(pointF, pointF2, pointF3, aniLineIv, valueAnimator);
            }
        });
        ofFloat.addListener(new C9232w(ofFloat, aniLineIv, this$0));
        ofFloat.start();
    }

    /* renamed from: W */
    public static final void m20676W(PointF startPoint, PointF controlPoint, PointF endPoint, C14640c0 aniLineIv, ValueAnimator animation) {
        AbstractC14656n.m8377g(startPoint, "$startPoint");
        AbstractC14656n.m8377g(controlPoint, "$controlPoint");
        AbstractC14656n.m8377g(endPoint, "$endPoint");
        AbstractC14656n.m8377g(aniLineIv, "$aniLineIv");
        AbstractC14656n.m8377g(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        AbstractC14656n.m8379e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        PointF m21633a = C8976d.m21633a(((Float) animatedValue).floatValue(), startPoint, controlPoint, endPoint);
        ((View) aniLineIv.element).setVisibility(0);
        ((View) aniLineIv.element).setX(m21633a.x);
        ((View) aniLineIv.element).setY(m21633a.y);
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.helper.e0.onAnimationUpdate(android.animation.ValueAnimator):void] */
    /* renamed from: a */
    public static /* synthetic */ void m20674a(PointF pointF, PointF pointF2, PointF pointF3, C14640c0 c14640c0, ValueAnimator valueAnimator) {
        m20679T(pointF, pointF2, pointF3, c14640c0, valueAnimator);
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.helper.a0.accept(java.lang.Object):void] */
    /* renamed from: b */
    public static /* synthetic */ void m20673b(InterfaceC14412l interfaceC14412l, Object obj) {
        m20652w(interfaceC14412l, obj);
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.helper.d0.run():void] */
    /* renamed from: c */
    public static /* synthetic */ void m20672c(FrameLayout frameLayout, C14640c0 c14640c0, C14640c0 c14640c02, C9209g0 c9209g0) {
        m20680S(frameLayout, c14640c0, c14640c02, c9209g0);
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.helper.b0.onAnimationUpdate(android.animation.ValueAnimator):void] */
    /* renamed from: d */
    public static /* synthetic */ void m20671d(PointF pointF, PointF pointF2, PointF pointF3, C14640c0 c14640c0, ValueAnimator valueAnimator) {
        m20676W(pointF, pointF2, pointF3, c14640c0, valueAnimator);
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.helper.y.run():void] */
    /* renamed from: e */
    public static /* synthetic */ void m20670e(FrameLayout frameLayout, C14640c0 c14640c0, C14640c0 c14640c02, C9209g0 c9209g0) {
        m20677V(frameLayout, c14640c0, c14640c02, c9209g0);
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.helper.c0.run():void] */
    /* renamed from: f */
    public static /* synthetic */ void m20669f(FrameLayout frameLayout, C14640c0 c14640c0, C14640c0 c14640c02, C9209g0 c9209g0) {
        m20682Q(frameLayout, c14640c0, c14640c02, c9209g0);
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.helper.f0.onAnimationUpdate(android.animation.ValueAnimator):void] */
    /* renamed from: g */
    public static /* synthetic */ void m20668g(PointF pointF, PointF pointF2, PointF pointF3, C14640c0 c14640c0, ValueAnimator valueAnimator) {
        m20681R(pointF, pointF2, pointF3, c14640c0, valueAnimator);
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.helper.z.accept(java.lang.Object):void] */
    /* renamed from: h */
    public static /* synthetic */ void m20667h(InterfaceC14412l interfaceC14412l, Object obj) {
        m20653v(interfaceC14412l, obj);
    }

    /* renamed from: j */
    public static /* synthetic */ void m20665j(C9209g0 c9209g0, long j, InterfaceC14536b interfaceC14536b, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC14536b = null;
        }
        c9209g0.m20666i(j, interfaceC14536b);
    }

    /* renamed from: v */
    public static final void m20653v(InterfaceC14412l tmp0, Object obj) {
        AbstractC14656n.m8377g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m20652w(InterfaceC14412l tmp0, Object obj) {
        AbstractC14656n.m8377g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final void m20698A(Activity activity, long j, InterfaceC14536b callback) {
        AbstractC14656n.m8377g(activity, "activity");
        AbstractC14656n.m8377g(callback, "callback");
        HashMap hashMap = new HashMap();
        hashMap.put("searchValue", Long.valueOf(j));
        C17594b.m658Z2(hashMap).compose(C14028j.m9195a()).subscribe(new C9219j(callback));
    }

    /* renamed from: B */
    public final View m20697B(Activity activity) {
        View view = LayoutInflater.from(activity).inflate(R.layout.layout_send_gift_animation, (ViewGroup) null);
        AbstractC14656n.m8378f(view, "view");
        return view;
    }

    /* renamed from: C */
    public final void m20696C(long j, InterfaceC14536b callback) {
        AbstractC14656n.m8377g(callback, "callback");
        HashMap hashMap = new HashMap();
        hashMap.put("searchValue", Long.valueOf(j));
        C17594b.m684U0(hashMap).compose(C14028j.m9195a()).subscribe(new C9220k(callback));
    }

    /* renamed from: D */
    public final void m20695D(Long l) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", l);
        C17594b.m679V0(hashMap).subscribe(new C9221l(l));
    }

    /* renamed from: E */
    public final void m20694E(int i, long j, InterfaceC14536b callback) {
        AbstractC14656n.m8377g(callback, "callback");
        HashMap hashMap = new HashMap();
        hashMap.put("mikeIndex", Integer.valueOf(i));
        hashMap.put("roomId", Long.valueOf(j));
        C17594b.m530z1(hashMap).compose(C14028j.m9195a()).subscribe(new C9222m(callback));
    }

    /* renamed from: F */
    public final void m20693F(Activity activity, FrameLayout flFullView) {
        InterfaceC14919l1 m7942d;
        AbstractC14656n.m8377g(activity, "activity");
        AbstractC14656n.m8377g(flFullView, "flFullView");
        if (this.f20216a.size() >= this.f20217b) {
            return;
        }
        InterfaceC14919l1 interfaceC14919l1 = this.f20218c;
        if (interfaceC14919l1 != null) {
            InterfaceC14919l1.C14920a.m7759a(interfaceC14919l1, null, 1, null);
        }
        m7942d = AbstractC14857h.m7942d(AbstractC14805f0.m8058a(C14980t0.m7560c()), null, null, new C9223n(3, 16L, activity, flFullView, null), 3, null);
        this.f20218c = m7942d;
    }

    /* renamed from: G */
    public final void m20692G(Activity activity, String pkId, InterfaceC14536b callback) {
        AbstractC14656n.m8377g(activity, "activity");
        AbstractC14656n.m8377g(pkId, "pkId");
        AbstractC14656n.m8377g(callback, "callback");
        HashMap hashMap = new HashMap();
        hashMap.put("searchValue", pkId);
        C17594b.m584o2(hashMap).compose(C14028j.m9195a()).subscribe(new C9224o(callback));
    }

    /* renamed from: H */
    public final void m20691H(long j, InterfaceC14536b interfaceC14536b) {
        HashMap hashMap = new HashMap();
        hashMap.put("searchValue", Long.valueOf(j));
        C17594b.m549v2(hashMap).compose(C14028j.m9195a()).subscribe(new C9225p(interfaceC14536b));
    }

    /* renamed from: I */
    public final void m20690I(long j, InterfaceC14536b interfaceC14536b) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Long.valueOf(j));
        C17594b.m737J2(hashMap).compose(C14028j.m9195a()).subscribe(new C9226q(interfaceC14536b));
    }

    /* renamed from: K */
    public final void m20688K(View view) {
        m20656s(view);
    }

    /* renamed from: L */
    public final void m20687L(long j, InterfaceC14536b callback) {
        AbstractC14656n.m8377g(callback, "callback");
        HashMap hashMap = new HashMap();
        hashMap.put("searchValue", Long.valueOf(j));
        C17594b.m717N2(hashMap).compose(C14028j.m9195a()).subscribe(new C9227r(callback));
    }

    /* renamed from: M */
    public final void m20686M(Activity activity, long j, InterfaceC14536b callback) {
        AbstractC14656n.m8377g(activity, "activity");
        AbstractC14656n.m8377g(callback, "callback");
        HashMap hashMap = new HashMap();
        hashMap.put("searchValue", Long.valueOf(j));
        C17594b.m586o0(hashMap).compose(C14028j.m9195a()).subscribe(new C9228s(callback));
    }

    /* renamed from: N */
    public final void m20685N() {
        C17594b.m643c3().compose(C14028j.m9195a()).subscribe(new C9229t());
    }

    /* renamed from: O */
    public final void m20684O(Activity activity, Handler handler, final FrameLayout flFullView, ArrayList micMic1to8ViewList, RoomInfoEntity mRoomInfoEntity, long j, String giftSmallImg, ImageView roomMasterIcon, RoomChatSeatDetailDTO mMasterSeatInfo, LinearLayout tvPopularVale, int i) {
        Object imageView;
        int i2;
        Object imageView2;
        int i3;
        Integer mikeIndex;
        int i4;
        Long userId;
        AbstractC14656n.m8377g(activity, "activity");
        AbstractC14656n.m8377g(handler, "handler");
        AbstractC14656n.m8377g(flFullView, "flFullView");
        AbstractC14656n.m8377g(micMic1to8ViewList, "micMic1to8ViewList");
        AbstractC14656n.m8377g(mRoomInfoEntity, "mRoomInfoEntity");
        AbstractC14656n.m8377g(giftSmallImg, "giftSmallImg");
        AbstractC14656n.m8377g(roomMasterIcon, "roomMasterIcon");
        AbstractC14656n.m8377g(mMasterSeatInfo, "mMasterSeatInfo");
        AbstractC14656n.m8377g(tvPopularVale, "tvPopularVale");
        List<RoomChatSeatDetailDTO> voiceMikeDetailVoList = mRoomInfoEntity.getVoiceMikeDetailVoList();
        RoomChatSeatDetailDTO roomChatSeatDetailDTO = null;
        if (voiceMikeDetailVoList != null) {
            Iterator<RoomChatSeatDetailDTO> it = voiceMikeDetailVoList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                RoomChatSeatDetailDTO list = it.next();
                AbstractC14656n.m8378f(list, "list");
                RoomChatSeatDetailDTO roomChatSeatDetailDTO2 = list;
                if (roomChatSeatDetailDTO2.getUserId() != null && (userId = roomChatSeatDetailDTO2.getUserId()) != null && j == userId.longValue()) {
                    roomChatSeatDetailDTO = roomChatSeatDetailDTO2;
                    break;
                }
            }
        }
        if (roomChatSeatDetailDTO != null) {
            int size = this.f20216a.size();
            System.out.println((Object) ("====池======imageViewPool=====" + size));
            final C14640c0 c14640c0 = new C14640c0();
            if (!this.f20216a.isEmpty()) {
                imageView2 = (View) this.f20216a.pop();
            } else {
                imageView2 = new ImageView(activity);
            }
            c14640c0.element = imageView2;
            if (!this.f20216a.isEmpty()) {
                c14640c0.element = this.f20216a.pop();
            } else {
                View aniLineIv = m20697B(activity);
                c14640c0.element = aniLineIv;
                AbstractC14656n.m8378f(aniLineIv, "aniLineIv");
                m20658q(aniLineIv, flFullView);
            }
            flFullView.bringChildToFront((View) c14640c0.element);
            ImageView ivVptGiftIcon = (ImageView) ((View) c14640c0.element).findViewById(R.id.ivVptGiftIcon);
            ImageView imageView3 = (ImageView) ((View) c14640c0.element).findViewById(R.id.ivGiftCardFrame);
            AbstractC14656n.m8378f(ivVptGiftIcon, "ivVptGiftIcon");
            ImageLoader.m21404B(ivVptGiftIcon, giftSmallImg, AbstractC2579h.m36243c(3.0f));
            if (i == 1) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView3.setVisibility(i3);
            Rect rect = new Rect();
            final C14640c0 c14640c02 = new C14640c0();
            c14640c02.element = new PointF();
            if (roomChatSeatDetailDTO.getMikeIndex() != null && ((mikeIndex = roomChatSeatDetailDTO.getMikeIndex()) == null || mikeIndex.intValue() != -1)) {
                Integer mikeIndex2 = roomChatSeatDetailDTO.getMikeIndex();
                if (mikeIndex2 != null) {
                    i4 = mikeIndex2.intValue();
                } else {
                    i4 = 0;
                }
                int i5 = i4 - 1;
                ((VoiceBitView) micMic1to8ViewList.get(i5)).getIvTopIcon().getGlobalVisibleRect(rect);
                int micType = ((VoiceBitView) micMic1to8ViewList.get(i5)).getMicType();
                if (micType != 3 && micType != 4) {
                    c14640c02.element = new PointF(rect.left - 22, rect.top - 20);
                } else {
                    c14640c02.element = new PointF(rect.left - 22, rect.top - (rect.height() / 3.0f));
                }
            } else {
                tvPopularVale.getGlobalVisibleRect(rect);
                c14640c02.element = new PointF(rect.left - (rect.width() / 3), rect.top - rect.height());
            }
            ((View) c14640c0.element).post(new Runnable() { // from class: com.vptrm.vcvroom.helper.c0
                @Override // java.lang.Runnable
                public final void run() {
                    C9209g0.m20669f(flFullView, c14640c0, c14640c02, this);
                }
            });
            return;
        }
        final C14640c0 c14640c03 = new C14640c0();
        if (!this.f20216a.isEmpty()) {
            imageView = (View) this.f20216a.pop();
        } else {
            imageView = new ImageView(activity);
        }
        c14640c03.element = imageView;
        if (!this.f20216a.isEmpty()) {
            c14640c03.element = this.f20216a.pop();
        } else {
            View aniLineIv2 = m20697B(activity);
            c14640c03.element = aniLineIv2;
            AbstractC14656n.m8378f(aniLineIv2, "aniLineIv");
            m20658q(aniLineIv2, flFullView);
        }
        flFullView.bringChildToFront((View) c14640c03.element);
        ImageView ivVptGiftIcon2 = (ImageView) ((View) c14640c03.element).findViewById(R.id.ivVptGiftIcon);
        ImageView imageView4 = (ImageView) ((View) c14640c03.element).findViewById(R.id.ivGiftCardFrame);
        AbstractC14656n.m8378f(ivVptGiftIcon2, "ivVptGiftIcon");
        ImageLoader.m21404B(ivVptGiftIcon2, giftSmallImg, AbstractC2579h.m36243c(3.0f));
        if (i == 1) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView4.setVisibility(i2);
        Rect rect2 = new Rect();
        final C14640c0 c14640c04 = new C14640c0();
        c14640c04.element = new PointF();
        tvPopularVale.getGlobalVisibleRect(rect2);
        c14640c04.element = new PointF(rect2.left - (rect2.width() / 3), rect2.top - rect2.height());
        ((View) c14640c03.element).post(new Runnable() { // from class: com.vptrm.vcvroom.helper.d0
            @Override // java.lang.Runnable
            public final void run() {
                C9209g0.m20672c(flFullView, c14640c03, c14640c04, this);
            }
        });
    }

    /* renamed from: U */
    public final void m20678U(Activity activity, Handler handler, final FrameLayout flFullView, ArrayList micMic1to8ViewList, ArrayList chooseList, RoomChatGiftEntity giftEntity, ImageView roomMasterIcon, LinearLayout tvPopularVale) {
        Object imageView;
        AbstractC14656n.m8377g(activity, "activity");
        AbstractC14656n.m8377g(handler, "handler");
        AbstractC14656n.m8377g(flFullView, "flFullView");
        AbstractC14656n.m8377g(micMic1to8ViewList, "micMic1to8ViewList");
        AbstractC14656n.m8377g(chooseList, "chooseList");
        AbstractC14656n.m8377g(giftEntity, "giftEntity");
        AbstractC14656n.m8377g(roomMasterIcon, "roomMasterIcon");
        AbstractC14656n.m8377g(tvPopularVale, "tvPopularVale");
        try {
            Iterator it = chooseList.iterator();
            while (it.hasNext()) {
                Object chooseList2 = it.next();
                AbstractC14656n.m8378f(chooseList2, "chooseList");
                RoomChatSeatDetailDTO roomChatSeatDetailDTO = (RoomChatSeatDetailDTO) chooseList2;
                final C14640c0 c14640c0 = new C14640c0();
                if (!this.f20216a.isEmpty()) {
                    imageView = (View) this.f20216a.pop();
                } else {
                    imageView = new ImageView(activity);
                }
                c14640c0.element = imageView;
                if (!this.f20216a.isEmpty()) {
                    c14640c0.element = this.f20216a.pop();
                } else {
                    View aniLineIv = m20697B(activity);
                    c14640c0.element = aniLineIv;
                    AbstractC14656n.m8378f(aniLineIv, "aniLineIv");
                    m20658q(aniLineIv, flFullView);
                }
                flFullView.bringChildToFront((View) c14640c0.element);
                ImageView ivVptGiftIcon = (ImageView) ((View) c14640c0.element).findViewById(R.id.ivVptGiftIcon);
                ImageView imageView2 = (ImageView) ((View) c14640c0.element).findViewById(R.id.ivGiftCardFrame);
                if (giftEntity.getGiftSmallImg() != null) {
                    AbstractC14656n.m8378f(ivVptGiftIcon, "ivVptGiftIcon");
                    ImageLoader.m21404B(ivVptGiftIcon, giftEntity.getGiftSmallImg(), AbstractC2579h.m36243c(3.0f));
                } else if (giftEntity.getGiftImg() != null) {
                    AbstractC14656n.m8378f(ivVptGiftIcon, "ivVptGiftIcon");
                    ImageLoader.m21404B(ivVptGiftIcon, giftEntity.getGiftImg(), AbstractC2579h.m36243c(3.0f));
                }
                if (giftEntity.getGiftCardFlag() == 1) {
                    imageView2.setVisibility(0);
                } else {
                    imageView2.setVisibility(8);
                }
                Rect rect = new Rect();
                final C14640c0 c14640c02 = new C14640c0();
                c14640c02.element = new PointF();
                if (roomChatSeatDetailDTO.getMikeIndex() != null) {
                    Integer mikeIndex = roomChatSeatDetailDTO.getMikeIndex();
                    if (mikeIndex != null && mikeIndex.intValue() == -1) {
                    }
                    int intValue = roomChatSeatDetailDTO.getMikeIndex().intValue() - 1;
                    ((VoiceBitView) micMic1to8ViewList.get(intValue)).getIvTopIcon().getGlobalVisibleRect(rect);
                    int micType = ((VoiceBitView) micMic1to8ViewList.get(intValue)).getMicType();
                    if (micType != 3 && micType != 4) {
                        c14640c02.element = new PointF(rect.left - 22, rect.top - 20);
                    } else {
                        c14640c02.element = new PointF(rect.left - 22, rect.top - (rect.height() / 3.0f));
                    }
                    ((View) c14640c0.element).post(new Runnable() { // from class: com.vptrm.vcvroom.helper.y
                        @Override // java.lang.Runnable
                        public final void run() {
                            C9209g0.m20670e(flFullView, c14640c0, c14640c02, this);
                        }
                    });
                }
                tvPopularVale.getGlobalVisibleRect(rect);
                c14640c02.element = new PointF(rect.left - (rect.width() / 3), rect.top - rect.height());
                ((View) c14640c0.element).post(new Runnable() { // from class: com.vptrm.vcvroom.helper.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9209g0.m20670e(flFullView, c14640c0, c14640c02, this);
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: X */
    public final ArrayList m20675X(ArrayList oldList) {
        AbstractC14656n.m8377g(oldList, "oldList");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = oldList.iterator();
        while (it.hasNext()) {
            VptInRoomUserEntity vptInRoomUserEntity = (VptInRoomUserEntity) it.next();
            if (vptInRoomUserEntity.getNobleLevel() != -1) {
                arrayList.add(vptInRoomUserEntity);
            } else if (vptInRoomUserEntity.isRobotUser()) {
                arrayList3.add(vptInRoomUserEntity);
            } else {
                arrayList2.add(vptInRoomUserEntity);
            }
        }
        C14592q.m8510x(arrayList, new VptInRoomUserEntity.VptInRoomUserNobleLevelEntityComparator());
        C14592q.m8510x(arrayList2, new VptInRoomUserEntity.VptInRoomUserTimeStampEntityComparator());
        C14592q.m8510x(arrayList3, new VptInRoomUserEntity.VptInRoomUserTimeStampEntityComparator());
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        return arrayList4;
    }

    /* renamed from: i */
    public final void m20666i(long j, InterfaceC14536b interfaceC14536b) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Long.valueOf(j));
        C17594b.m657a(hashMap).compose(C14028j.m9195a()).subscribe(new C9212c(interfaceC14536b));
    }

    /* renamed from: q */
    public final void m20658q(View view, FrameLayout frameLayout) {
        try {
            float m6343a = (ScreenUtil.screenWidth / 2.0f) - AbstractC15473g.m6343a(30.0f);
            float m6343a2 = (ScreenUtil.screenHeight / 2.0f) + AbstractC15473g.m6343a(100.0f);
            view.setLayoutParams(new FrameLayout.LayoutParams(AbstractC15473g.m6343a(60.0f), AbstractC15473g.m6343a(60.0f)));
            view.setX(m6343a);
            view.setY(m6343a2);
            if (frameLayout != null) {
                frameLayout.addView(view);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: r */
    public final void m20657r() {
        InterfaceC14919l1 interfaceC14919l1 = this.f20218c;
        if (interfaceC14919l1 != null) {
            InterfaceC14919l1.C14920a.m7759a(interfaceC14919l1, null, 1, null);
        }
        for (View imageView : this.f20216a) {
            AbstractC14656n.m8378f(imageView, "imageView");
            m20688K(imageView);
        }
        this.f20216a.clear();
    }

    /* renamed from: s */
    public final void m20656s(View view) {
        if (view != null) {
            view.clearAnimation();
        }
        if (view != null) {
            view.setScaleX(1.0f);
        }
        if (view != null) {
            view.setScaleY(1.0f);
        }
        if (view != null) {
            view.setX(0.0f);
        }
        if (view != null) {
            view.setY(0.0f);
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: t */
    public final void m20655t(long j, int i, boolean z) {
        if (i == -1) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("mikeIndex", Integer.valueOf(i));
        hashMap.put("roomId", Long.valueOf(j));
        if (z) {
            hashMap.put("optType", 1);
        } else {
            hashMap.put("optType", 2);
        }
        C17594b.m682U2(hashMap).subscribe(new C9213d());
    }

    /* renamed from: u */
    public final void m20654u() {
        Observable observeOn = C17594b.m677V2().subscribeOn(Schedulers.m9075io()).observeOn(AndroidSchedulers.mainThread());
        final C9214e c9214e = C9214e.f20221a;
        Consumer consumer = new Consumer() { // from class: com.vptrm.vcvroom.helper.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9209g0.m20667h(c9214e, obj);
            }
        };
        final C9215f c9215f = C9215f.f20222a;
        observeOn.subscribe(consumer, new Consumer() { // from class: com.vptrm.vcvroom.helper.a0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9209g0.m20673b(c9215f, obj);
            }
        });
    }

    /* renamed from: x */
    public final void m20651x(Activity activity, long j, InterfaceC14536b callback) {
        AbstractC14656n.m8377g(activity, "activity");
        AbstractC14656n.m8377g(callback, "callback");
        HashMap hashMap = new HashMap();
        hashMap.put("searchValue", Long.valueOf(j));
        C17594b.m672W2(hashMap).compose(C14028j.m9195a()).subscribe(new C9216g(callback));
    }

    /* renamed from: y */
    public final void m20650y(Activity activity, long j, int i, InterfaceC14536b callback) {
        AbstractC14656n.m8377g(activity, "activity");
        AbstractC14656n.m8377g(callback, "callback");
        HashMap hashMap = new HashMap();
        hashMap.put("roomId", Long.valueOf(j));
        hashMap.put("goldNum", Integer.valueOf(i));
        C17594b.m667X2(hashMap).compose(C14028j.m9195a()).subscribe(new C9217h(callback));
    }

    /* renamed from: z */
    public final void m20649z(Activity activity, long j, InterfaceC14536b callback) {
        AbstractC14656n.m8377g(activity, "activity");
        AbstractC14656n.m8377g(callback, "callback");
        HashMap hashMap = new HashMap();
        hashMap.put("searchValue", Long.valueOf(j));
        C17594b.m662Y2(hashMap).compose(C14028j.m9195a()).subscribe(new C9218i(callback));
    }

    public C9209g0() {
        this.f20216a = new Stack();
        this.f20217b = 40;
    }
}
