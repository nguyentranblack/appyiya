package com.vptrm.vcvroom.utils;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.vptrm.library.entity.SGateEntity;
import com.vptrm.vcvroom.R;
import com.vptrm.vcvroom.page.adapter.SgatePaymentMethodAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC14656n;
import p284d2.InterfaceC13246d;
import p426ld.C15101a;
import razerdp.basepopup.BasePopupWindow;

/* loaded from: classes4.dex */
public final class SgatePaymentMethodPopup extends BasePopupWindow {

    /* renamed from: l */
    public RecyclerView f25595l;

    /* renamed from: m */
    public SgatePaymentMethodAdapter f25596m;

    /* renamed from: n */
    public InterfaceC12823a f25597n;

    /* renamed from: com.vptrm.vcvroom.utils.SgatePaymentMethodPopup$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC12823a {
        /* renamed from: a */
        void mo11999a(SGateEntity sGateEntity);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SgatePaymentMethodPopup(Context context, InterfaceC12823a listener) {
        super(context);
        AbstractC14656n.m8377g(listener, "listener");
        View m4539g = m4539g(R.id.recyclerView);
        AbstractC14656n.m8378f(m4539g, "findViewById(R.id.recyclerView)");
        this.f25595l = (RecyclerView) m4539g;
        this.f25597n = listener;
        m12002A0();
    }

    /* renamed from: A0 */
    private final void m12002A0() {
        this.f25595l.setLayoutManager(new LinearLayoutManager(m4537h()));
        ArrayList m7217p0 = C15101a.f29751S0.m7185a().m7217p0();
        SgatePaymentMethodAdapter sgatePaymentMethodAdapter = new SgatePaymentMethodAdapter();
        this.f25596m = sgatePaymentMethodAdapter;
        this.f25595l.setAdapter(sgatePaymentMethodAdapter);
        SgatePaymentMethodAdapter sgatePaymentMethodAdapter2 = this.f25596m;
        SgatePaymentMethodAdapter sgatePaymentMethodAdapter3 = null;
        if (sgatePaymentMethodAdapter2 == null) {
            AbstractC14656n.m8360x("mAdapter");
            sgatePaymentMethodAdapter2 = null;
        }
        sgatePaymentMethodAdapter2.setList(m7217p0);
        SgatePaymentMethodAdapter sgatePaymentMethodAdapter4 = this.f25596m;
        if (sgatePaymentMethodAdapter4 == null) {
            AbstractC14656n.m8360x("mAdapter");
        } else {
            sgatePaymentMethodAdapter3 = sgatePaymentMethodAdapter4;
        }
        sgatePaymentMethodAdapter3.setOnItemClickListener(new InterfaceC13246d() { // from class: com.vptrm.vcvroom.utils.l
            {
                SgatePaymentMethodPopup.this = this;
            }

            @Override // p284d2.InterfaceC13246d
            /* renamed from: a */
            public final void mo10576a(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                SgatePaymentMethodPopup.m12000z0(SgatePaymentMethodPopup.this, baseQuickAdapter, view, i);
            }
        });
    }

    /* renamed from: B0 */
    public static final void m12001B0(SgatePaymentMethodPopup this$0, BaseQuickAdapter adapter, View view, int i) {
        AbstractC14656n.m8377g(this$0, "this$0");
        AbstractC14656n.m8377g(adapter, "adapter");
        AbstractC14656n.m8377g(view, "view");
        SgatePaymentMethodAdapter sgatePaymentMethodAdapter = this$0.f25596m;
        if (sgatePaymentMethodAdapter == null) {
            AbstractC14656n.m8360x("mAdapter");
            sgatePaymentMethodAdapter = null;
        }
        SGateEntity locale = sgatePaymentMethodAdapter.getData().get(i);
        InterfaceC12823a interfaceC12823a = this$0.f25597n;
        if (interfaceC12823a != null) {
            AbstractC14656n.m8378f(locale, "locale");
            interfaceC12823a.mo11999a(locale);
        }
        this$0.m4545d();
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.utils.l.a(com.chad.library.adapter.base.BaseQuickAdapter, android.view.View, int):void] */
    /* renamed from: z0 */
    public static /* synthetic */ void m12000z0(SgatePaymentMethodPopup sgatePaymentMethodPopup, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        m12001B0(sgatePaymentMethodPopup, baseQuickAdapter, view, i);
    }

    @Override // razerdp.basepopup.BasePopupWindow
    /* renamed from: u */
    public View mo4315u() {
        View m4547c = m4547c(R.layout.popup_choose_country);
        AbstractC14656n.m8378f(m4547c, "createPopupById(R.layout.popup_choose_country)");
        return m4547c;
    }
}
