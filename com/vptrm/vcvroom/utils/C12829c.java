package com.vptrm.vcvroom.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.C2666l;
import com.bumptech.glide.ComponentCallbacks2C2627c;
import com.luck.picture.lib.engine.CropFileEngine;
import com.netease.nim.uikit.engine.ImageLoaderUtils;
import com.yalantis.ucrop.C13140a;
import io.agora.rtc2.Constants;
import java.util.ArrayList;
import ke.InterfaceC14549l;
import p493q1.AbstractC15977c;
import p510r1.InterfaceC16114d;

/* renamed from: com.vptrm.vcvroom.utils.c */
/* loaded from: classes4.dex */
public class C12829c implements CropFileEngine {

    /* renamed from: a */
    public float f25602a;

    /* renamed from: b */
    public float f25603b;

    public C12829c(float f, float f2) {
        this.f25602a = f;
        this.f25603b = f2;
    }

    /* renamed from: a */
    public final C13140a.C13141a m11993a(float f, float f2) {
        C13140a.C13141a c13141a = new C13140a.C13141a();
        c13141a.m10935j(true);
        c13141a.m10934k(true);
        c13141a.m10943b(false);
        c13141a.m10940e(true);
        c13141a.m10936i(100.0f);
        c13141a.m10937h(true);
        c13141a.m10930o(f, f2);
        c13141a.m10942c(false);
        c13141a.m10933l(Color.parseColor("#393a3e"));
        c13141a.m10932m(Color.parseColor("#393a3e"));
        c13141a.m10931n(Color.parseColor("#FFFFFF"));
        return c13141a;
    }

    @Override // com.luck.picture.lib.engine.CropFileEngine
    public void onStartCrop(Fragment fragment, Uri uri, Uri uri2, ArrayList arrayList, int i) {
        C13140a.C13141a m11993a = m11993a(this.f25602a, this.f25603b);
        C13140a m10948i = C13140a.m10948i(uri, uri2, arrayList);
        m10948i.m10945l(m11993a);
        m10948i.m10947j(new C12830a());
        m10948i.m10946k(fragment.requireActivity(), fragment, i);
    }

    /* renamed from: com.vptrm.vcvroom.utils.c$a */
    /* loaded from: classes4.dex */
    public class C12830a implements InterfaceC14549l {

        /* renamed from: com.vptrm.vcvroom.utils.c$a$a */
        /* loaded from: classes4.dex */
        public class C12831a extends AbstractC15977c {

            /* renamed from: d */
            public final /* synthetic */ InterfaceC14549l.InterfaceC14550a f25605d;

            public C12831a(InterfaceC14549l.InterfaceC14550a interfaceC14550a) {
                this.f25605d = interfaceC14550a;
            }

            /* JADX DEBUG: Method merged with bridge method */
            @Override // p493q1.InterfaceC15988k
            /* renamed from: b */
            public void mo4906e(Bitmap bitmap, InterfaceC16114d interfaceC16114d) {
                InterfaceC14549l.InterfaceC14550a interfaceC14550a = this.f25605d;
                if (interfaceC14550a != null) {
                    interfaceC14550a.onCall(bitmap);
                }
            }

            @Override // p493q1.InterfaceC15988k
            /* renamed from: g */
            public void mo4902g(Drawable drawable) {
                InterfaceC14549l.InterfaceC14550a interfaceC14550a = this.f25605d;
                if (interfaceC14550a != null) {
                    interfaceC14550a.onCall(null);
                }
            }
        }

        public C12830a() {
        }

        @Override // ke.InterfaceC14549l
        public void loadImage(Context context, String str, ImageView imageView) {
            if (ImageLoaderUtils.assertValidRequest(context)) {
                ((C2666l) ComponentCallbacks2C2627c.m35990t(context).mo6200x(str).mo5327f0(Constants.VIDEO_ORIENTATION_180, Constants.VIDEO_ORIENTATION_180)).m35880L0(imageView);
            }
        }

        @Override // ke.InterfaceC14549l
        public void loadImage(Context context, Uri uri, int i, int i2, InterfaceC14549l.InterfaceC14550a interfaceC14550a) {
            ((C2666l) ComponentCallbacks2C2627c.m35990t(context).mo6207c().mo6251P0(uri).mo5327f0(i, i2)).m35883I0(new C12831a(interfaceC14550a));
        }
    }
}
