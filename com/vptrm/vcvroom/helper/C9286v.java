package com.vptrm.vcvroom.helper;

import af.C0179i;
import af.C0185n;
import af.EnumC0181j;
import af.InterfaceC0178h;
import android.graphics.Typeface;
import com.blankj.utilcode.util.AbstractC2572g;
import com.google.android.exoplayer2.C3332C;
import com.vptrm.common.entity.VptPrettyNumEntity;
import com.vptrm.vcvroom.R;
import com.vptrm.vcvroom.widget.VptPrettyIdView;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC14648g;
import kotlin.jvm.internal.AbstractC14657o;
import p397jf.InterfaceC14401a;
import p455nd.C15493t;

/* renamed from: com.vptrm.vcvroom.helper.v */
/* loaded from: classes3.dex */
public final class C9286v {

    /* renamed from: a */
    public static final C9288b f20316a = new C9288b(null);

    /* renamed from: b */
    public static final InterfaceC0178h f20317b = C0179i.m38721a(EnumC0181j.f521a, C9287a.f20318a);

    /* renamed from: com.vptrm.vcvroom.helper.v$a */
    /* loaded from: classes3.dex */
    public static final class C9287a extends AbstractC14657o implements InterfaceC14401a {

        /* renamed from: a */
        public static final C9287a f20318a = new C9287a();

        public C9287a() {
            super(0);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // p397jf.InterfaceC14401a
        /* renamed from: b */
        public final C9286v invoke() {
            return new C9286v(null);
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.v$b */
    /* loaded from: classes3.dex */
    public static final class C9288b {
        public C9288b() {
        }

        /* renamed from: a */
        public final C9286v m20512a() {
            return (C9286v) C9286v.f20317b.getValue();
        }

        public /* synthetic */ C9288b(AbstractC14648g abstractC14648g) {
            this();
        }
    }

    public C9286v() {
    }

    /* renamed from: b */
    public static final C9286v m20517b() {
        return f20316a.m20512a();
    }

    /* renamed from: c */
    public final void m20516c(VptPrettyIdView vptPrettyIdView, VptPrettyNumEntity vptPrettyNumEntity, int i) {
        m20515d(vptPrettyIdView, vptPrettyNumEntity, i, false);
    }

    /* renamed from: d */
    public final void m20515d(VptPrettyIdView vptPrettyIdView, VptPrettyNumEntity vptPrettyNumEntity, int i, boolean z) {
        if (vptPrettyIdView != null) {
            vptPrettyIdView.setTextColor(vptPrettyIdView.getNormalTextColor());
            vptPrettyIdView.setSVipAnimation(z);
            if (vptPrettyNumEntity != null && vptPrettyNumEntity.getPrettyNo() != null && vptPrettyNumEntity.getLevel() != 0) {
                vptPrettyIdView.setAccountBg(R.drawable.icon_pretty_num1);
                vptPrettyIdView.getTvAccountId().setTypeface(Typeface.DEFAULT_BOLD);
                if (vptPrettyNumEntity.getLevel() == 1) {
                    vptPrettyIdView.setTextColor(AbstractC2572g.m36256b("#DC143C"));
                    vptPrettyIdView.setAccountBg(R.drawable.icon_pretty_num1);
                } else if (vptPrettyNumEntity.getLevel() == 2) {
                    vptPrettyIdView.setTextColor(AbstractC2572g.m36256b("#DC143C"));
                    vptPrettyIdView.setAccountBg(R.drawable.icon_pretty_num2);
                } else if (vptPrettyNumEntity.getLevel() == 3) {
                    vptPrettyIdView.setTextColor(AbstractC2572g.m36256b("#c37e00"));
                    vptPrettyIdView.setAccountBg(R.drawable.icon_pretty_num3);
                } else {
                    vptPrettyIdView.setTextColor(AbstractC2572g.m36256b("#c37e00"));
                    vptPrettyIdView.setAccountBg(R.drawable.icon_pretty_num4);
                }
                vptPrettyIdView.setAccountIdText(vptPrettyNumEntity.getPrettyNo());
                return;
            }
            vptPrettyIdView.setAccountIdText("ID: " + i);
            vptPrettyIdView.setAccountBg(0);
            vptPrettyIdView.getTvAccountId().setTypeface(Typeface.DEFAULT);
        }
    }

    /* renamed from: e */
    public final C0185n m20514e(Long l) {
        long j;
        String str;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (j < 1000) {
            return new C0185n(Long.valueOf(j), String.valueOf(j));
        }
        double d = j;
        double d2 = d / 1000;
        double d3 = d / 1000000;
        double d4 = d / 1000000000;
        DecimalFormat decimalFormat = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.ENGLISH));
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        if (j >= C3332C.NANOS_PER_SECOND) {
            str = "B";
            d2 = d4;
        } else if (j >= 1000000) {
            str = "m";
            d2 = d3;
        } else {
            str = "k";
        }
        C15493t.m6199a("保留2位小数原始数据：" + j);
        C15493t.m6199a("保留2位小数" + decimalFormat.format(d2));
        return new C0185n(Long.valueOf(j), decimalFormat.format(d2) + str);
    }

    public /* synthetic */ C9286v(AbstractC14648g abstractC14648g) {
        this();
    }
}
