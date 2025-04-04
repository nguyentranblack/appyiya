package com.vptrm.vcvroom.utils;

import ad.AbstractC0132f;
import af.C0179i;
import af.EnumC0181j;
import af.InterfaceC0178h;
import com.vptrm.vcvroom.entity.TradeTypeEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC14648g;
import kotlin.jvm.internal.AbstractC14656n;
import kotlin.jvm.internal.AbstractC14657o;
import p397jf.InterfaceC14401a;
import p426ld.C15101a;
import p612xd.C17594b;

/* renamed from: com.vptrm.vcvroom.utils.b */
/* loaded from: classes4.dex */
public final class C12825b {

    /* renamed from: a */
    public static final C12827b f25599a = new C12827b(null);

    /* renamed from: b */
    public static final InterfaceC0178h f25600b = C0179i.m38721a(EnumC0181j.f521a, C12826a.f25601a);

    /* renamed from: com.vptrm.vcvroom.utils.b$a */
    /* loaded from: classes4.dex */
    public static final class C12826a extends AbstractC14657o implements InterfaceC14401a {

        /* renamed from: a */
        public static final C12826a f25601a = new C12826a();

        public C12826a() {
            super(0);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // p397jf.InterfaceC14401a
        /* renamed from: b */
        public final C12825b invoke() {
            return new C12825b(null);
        }
    }

    /* renamed from: com.vptrm.vcvroom.utils.b$b */
    /* loaded from: classes4.dex */
    public static final class C12827b {
        public C12827b() {
        }

        /* renamed from: a */
        public final C12825b m11995a() {
            return (C12825b) C12825b.f25600b.getValue();
        }

        public /* synthetic */ C12827b(AbstractC14648g abstractC14648g) {
            this();
        }
    }

    /* renamed from: com.vptrm.vcvroom.utils.b$c */
    /* loaded from: classes4.dex */
    public static final class C12828c extends AbstractC0132f {
        /* JADX DEBUG: Method merged with bridge method */
        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(ArrayList list) {
            AbstractC14656n.m8377g(list, "list");
            if (list.size() > 0) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    TradeTypeEntity tradeTypeEntity = (TradeTypeEntity) it.next();
                    Integer accountType = tradeTypeEntity.getAccountType();
                    if (accountType != null && accountType.intValue() == 5) {
                        C15101a.f29751S0.m7185a().m7282U1(tradeTypeEntity.getBalanceAmount());
                        return;
                    }
                }
            }
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }
    }

    public C12825b() {
    }

    /* renamed from: b */
    public final void m11997b() {
        C17594b.m781A3(new HashMap()).subscribe(new C12828c());
    }

    public /* synthetic */ C12825b(AbstractC14648g abstractC14648g) {
        this();
    }
}
