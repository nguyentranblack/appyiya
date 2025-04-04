package com.vptrm.vcvroom.utils;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.vptrm.library.entity.NoTokenSwitchEntity;
import com.vptrm.vcvroom.R;
import com.vptrm.vcvroom.page.adapter.ChooseCountryAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC14656n;
import p284d2.InterfaceC13246d;
import p426ld.C15101a;
import razerdp.basepopup.BasePopupWindow;

/* loaded from: classes4.dex */
public final class ChooseCountryPopup extends BasePopupWindow {

    /* renamed from: l */
    public RecyclerView f25592l;

    /* renamed from: m */
    public ChooseCountryAdapter f25593m;

    /* renamed from: n */
    public InterfaceC12822a f25594n;

    /* renamed from: com.vptrm.vcvroom.utils.ChooseCountryPopup$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC12822a {
        /* renamed from: a */
        void mo12003a(NoTokenSwitchEntity.DukPayChannel dukPayChannel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseCountryPopup(Context context, InterfaceC12822a listener) {
        super(context);
        AbstractC14656n.m8377g(listener, "listener");
        View m4539g = m4539g(R.id.recyclerView);
        AbstractC14656n.m8378f(m4539g, "findViewById(R.id.recyclerView)");
        this.f25592l = (RecyclerView) m4539g;
        this.f25594n = listener;
        m12006A0();
    }

    /* renamed from: B0 */
    public static final void m12005B0(ChooseCountryPopup this$0, BaseQuickAdapter adapter, View view, int i) {
        AbstractC14656n.m8377g(this$0, "this$0");
        AbstractC14656n.m8377g(adapter, "adapter");
        AbstractC14656n.m8377g(view, "view");
        ChooseCountryAdapter chooseCountryAdapter = this$0.f25593m;
        if (chooseCountryAdapter == null) {
            AbstractC14656n.m8360x("mAdapter");
            chooseCountryAdapter = null;
        }
        NoTokenSwitchEntity.DukPayChannel locale = chooseCountryAdapter.getData().get(i);
        InterfaceC12822a interfaceC12822a = this$0.f25594n;
        if (interfaceC12822a != null) {
            AbstractC14656n.m8378f(locale, "locale");
            interfaceC12822a.mo12003a(locale);
        }
        this$0.m4545d();
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.utils.a.a(com.chad.library.adapter.base.BaseQuickAdapter, android.view.View, int):void] */
    /* renamed from: z0 */
    public static /* synthetic */ void m12004z0(ChooseCountryPopup chooseCountryPopup, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        m12005B0(chooseCountryPopup, baseQuickAdapter, view, i);
    }

    /* renamed from: A0 */
    public final void m12006A0() {
        this.f25592l.setLayoutManager(new LinearLayoutManager(m4537h()));
        ArrayList m7206t = C15101a.f29751S0.m7185a().m7206t();
        ChooseCountryAdapter chooseCountryAdapter = new ChooseCountryAdapter();
        this.f25593m = chooseCountryAdapter;
        this.f25592l.setAdapter(chooseCountryAdapter);
        ChooseCountryAdapter chooseCountryAdapter2 = this.f25593m;
        ChooseCountryAdapter chooseCountryAdapter3 = null;
        if (chooseCountryAdapter2 == null) {
            AbstractC14656n.m8360x("mAdapter");
            chooseCountryAdapter2 = null;
        }
        chooseCountryAdapter2.setList(m7206t);
        ChooseCountryAdapter chooseCountryAdapter4 = this.f25593m;
        if (chooseCountryAdapter4 == null) {
            AbstractC14656n.m8360x("mAdapter");
        } else {
            chooseCountryAdapter3 = chooseCountryAdapter4;
        }
        chooseCountryAdapter3.setOnItemClickListener(new InterfaceC13246d() { // from class: com.vptrm.vcvroom.utils.a
            {
                ChooseCountryPopup.this = this;
            }

            @Override // p284d2.InterfaceC13246d
            /* renamed from: a */
            public final void mo10576a(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                ChooseCountryPopup.m12004z0(ChooseCountryPopup.this, baseQuickAdapter, view, i);
            }
        });
    }

    @Override // razerdp.basepopup.BasePopupWindow
    /* renamed from: u */
    public View mo4315u() {
        View m4547c = m4547c(R.layout.popup_choose_country);
        AbstractC14656n.m8378f(m4547c, "createPopupById(R.layout.popup_choose_country)");
        return m4547c;
    }
}
