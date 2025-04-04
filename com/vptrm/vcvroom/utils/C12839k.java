package com.vptrm.vcvroom.utils;

import af.C0172e0;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.blankj.utilcode.util.AbstractC2603r;
import com.luck.picture.lib.basic.PictureSelector;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.interfaces.OnResultCallbackListener;
import com.vptrm.common.helper.C8909l0;
import com.vptrm.common.utils.C8997l;
import com.vptrm.library.base.RxActivity;
import com.vptrm.vcvroom.page.dialog.MediaIsCamearOrAlbumDialog;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC14656n;
import kotlin.jvm.internal.AbstractC14657o;
import kotlin.text.C14721u;
import p333fh.C13689f;
import p362hf.C13933l;
import p397jf.InterfaceC14412l;
import p413kd.InterfaceC14536b;
import p455nd.AbstractC15467c0;
import p455nd.C15486m;
import p545t7.C16558r;
import p594wc.AbstractC17198d;

/* renamed from: com.vptrm.vcvroom.utils.k */
/* loaded from: classes4.dex */
public final class C12839k {

    /* renamed from: a */
    public static final C12839k f25613a = new C12839k();

    /* renamed from: com.vptrm.vcvroom.utils.k$a */
    /* loaded from: classes4.dex */
    public static final class C12840a extends AbstractC14657o implements InterfaceC14412l {
        final /* synthetic */ RxActivity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12840a(RxActivity rxActivity) {
            super(1);
            this.$activity = rxActivity;
        }

        @Override // p397jf.InterfaceC14412l
        /* renamed from: b */
        public final File invoke(String t) {
            AbstractC14656n.m8377g(t, "t");
            return C13689f.m9930o(this.$activity).m9915o(50).m9906x(C12839k.f25613a.m11972s().getPath()).m9918l(t);
        }
    }

    /* renamed from: com.vptrm.vcvroom.utils.k$b */
    /* loaded from: classes4.dex */
    public static final class C12841b extends AbstractC14657o implements InterfaceC14412l {
        final /* synthetic */ InterfaceC14536b $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12841b(InterfaceC14536b interfaceC14536b) {
            super(1);
            this.$callback = interfaceC14536b;
        }

        /* renamed from: b */
        public final void m11965b(File file) {
            if (file != null) {
                this.$callback.onSuccess(file.getAbsolutePath());
                AbstractC2603r.m36093i("文件onSuccess acc 3");
            }
        }

        @Override // p397jf.InterfaceC14412l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m11965b((File) obj);
            return C0172e0.f512a;
        }
    }

    /* renamed from: com.vptrm.vcvroom.utils.k$c */
    /* loaded from: classes4.dex */
    public static final class C12842c extends AbstractC14657o implements InterfaceC14412l {

        /* renamed from: a */
        public static final C12842c f25614a = new C12842c();

        public C12842c() {
            super(1);
        }

        @Override // p397jf.InterfaceC14412l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C0172e0.f512a;
        }

        public final void invoke(Throwable th) {
            AbstractC15467c0.m6354c(th != null ? th.getMessage() : null);
        }
    }

    /* renamed from: com.vptrm.vcvroom.utils.k$d */
    /* loaded from: classes4.dex */
    public static final class C12843d extends AbstractC14657o implements InterfaceC14412l {
        final /* synthetic */ RxActivity $activity;
        final /* synthetic */ String $localPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12843d(RxActivity rxActivity, String str) {
            super(1);
            this.$activity = rxActivity;
            this.$localPath = str;
        }

        @Override // p397jf.InterfaceC14412l
        /* renamed from: b */
        public final List invoke(Uri t) {
            AbstractC14656n.m8377g(t, "t");
            return C13689f.m9930o(this.$activity).m9915o(50).m9911s(this.$localPath).m9906x(C12839k.f25613a.m11972s().getPath()).m9916n();
        }
    }

    /* renamed from: com.vptrm.vcvroom.utils.k$e */
    /* loaded from: classes4.dex */
    public static final class C12844e extends AbstractC14657o implements InterfaceC14412l {
        final /* synthetic */ RxActivity $activity;
        final /* synthetic */ InterfaceC14536b $callback;
        final /* synthetic */ String $localPath;
        final /* synthetic */ Uri $originUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12844e(String str, RxActivity rxActivity, Uri uri, InterfaceC14536b interfaceC14536b) {
            super(1);
            this.$localPath = str;
            this.$activity = rxActivity;
            this.$originUri = uri;
            this.$callback = interfaceC14536b;
        }

        /* renamed from: b */
        public final void m11963b(List list) {
            if (list != null) {
                String str = this.$localPath;
                RxActivity rxActivity = this.$activity;
                Uri uri = this.$originUri;
                InterfaceC14536b interfaceC14536b = this.$callback;
                if (!list.isEmpty()) {
                    String path = ((File) list.get(0)).getPath();
                    AbstractC2603r.m36093i("文件对比1：" + path);
                    AbstractC2603r.m36093i("文件对比2：" + str);
                    if (TextUtils.equals(((File) list.get(0)).getPath(), str)) {
                        AbstractC2603r.m36093i("进入压缩 选择的文件地址：" + str);
                        C12839k c12839k = C12839k.f25613a;
                        File m11971t = c12839k.m11971t(str.toString());
                        c12839k.m11973r(rxActivity, uri, m11971t);
                        interfaceC14536b.onSuccess(m11971t.getPath());
                        AbstractC2603r.m36093i("文件onSuccess acc 1");
                        return;
                    }
                    interfaceC14536b.onSuccess(((File) list.get(0)).getPath());
                    AbstractC2603r.m36093i("文件onSuccess acc 2");
                }
            }
        }

        @Override // p397jf.InterfaceC14412l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m11963b((List) obj);
            return C0172e0.f512a;
        }
    }

    /* renamed from: com.vptrm.vcvroom.utils.k$f */
    /* loaded from: classes4.dex */
    public static final class C12845f extends AbstractC14657o implements InterfaceC14412l {

        /* renamed from: a */
        public static final C12845f f25615a = new C12845f();

        public C12845f() {
            super(1);
        }

        @Override // p397jf.InterfaceC14412l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C0172e0.f512a;
        }

        public final void invoke(Throwable th) {
            AbstractC15467c0.m6354c(th != null ? th.getMessage() : null);
        }
    }

    /* renamed from: com.vptrm.vcvroom.utils.k$g */
    /* loaded from: classes4.dex */
    public static final class C12846g implements MediaIsCamearOrAlbumDialog.InterfaceC9617b {

        /* renamed from: a */
        public final /* synthetic */ RxActivity f25616a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC14536b f25617b;

        /* renamed from: c */
        public final /* synthetic */ boolean f25618c;

        /* renamed from: d */
        public final /* synthetic */ boolean f25619d;

        /* renamed from: com.vptrm.vcvroom.utils.k$g$a */
        /* loaded from: classes4.dex */
        public static final class C12847a implements OnResultCallbackListener {

            /* renamed from: a */
            public final /* synthetic */ RxActivity f25620a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC14536b f25621b;

            public C12847a(RxActivity rxActivity, InterfaceC14536b interfaceC14536b) {
                this.f25620a = rxActivity;
                this.f25621b = interfaceC14536b;
            }

            @Override // com.luck.picture.lib.interfaces.OnResultCallbackListener
            public void onCancel() {
            }

            @Override // com.luck.picture.lib.interfaces.OnResultCallbackListener
            public void onResult(ArrayList result) {
                String str;
                Uri uri;
                String str2;
                String str3;
                String str4;
                String str5;
                AbstractC14656n.m8377g(result, "result");
                if (result.size() > 0) {
                    Object obj = result.get(0);
                    AbstractC14656n.m8380d(obj);
                    LocalMedia localMedia = (LocalMedia) obj;
                    String str6 = null;
                    if (localMedia != null) {
                        str = localMedia.getRealPath();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        uri = Uri.fromFile(new File(str));
                    } else {
                        uri = null;
                    }
                    if (localMedia != null) {
                        str2 = localMedia.getRealPath();
                    } else {
                        str2 = null;
                    }
                    if (C14721u.m8238J(String.valueOf(str2), PictureMimeType.GIF, false, 2, null)) {
                        C12839k c12839k = C12839k.f25613a;
                        if (localMedia != null) {
                            str6 = localMedia.getRealPath();
                        }
                        File m11971t = c12839k.m11971t(String.valueOf(str6));
                        RxActivity rxActivity = this.f25620a;
                        AbstractC14656n.m8380d(uri);
                        c12839k.m11973r(rxActivity, uri, m11971t);
                        this.f25621b.onSuccess(m11971t.getPath());
                        return;
                    }
                    AbstractC2603r.m36093i("相册选择的absolutePath：" + str);
                    AbstractC2603r.m36093i("相册选择的uriFromLocalMedia：" + uri);
                    if (localMedia != null) {
                        str3 = localMedia.getAvailablePath();
                    } else {
                        str3 = null;
                    }
                    AbstractC2603r.m36093i("相册选择的 availablePath：" + str3);
                    if (localMedia != null) {
                        str4 = localMedia.getOriginalPath();
                    } else {
                        str4 = null;
                    }
                    AbstractC2603r.m36093i("相册选择的 originalPath：" + str4);
                    if (localMedia != null) {
                        str5 = localMedia.getCompressPath();
                    } else {
                        str5 = null;
                    }
                    AbstractC2603r.m36093i("相册选择的 compressPath：" + str5);
                    if (localMedia != null) {
                        str6 = localMedia.getRealPath();
                    }
                    AbstractC2603r.m36093i("相册选择的 realPath：" + str6);
                    C12839k c12839k2 = C12839k.f25613a;
                    RxActivity rxActivity2 = this.f25620a;
                    AbstractC14656n.m8380d(uri);
                    AbstractC14656n.m8380d(str);
                    c12839k2.m11981j(rxActivity2, uri, str, this.f25621b);
                }
            }
        }

        /* renamed from: com.vptrm.vcvroom.utils.k$g$b */
        /* loaded from: classes4.dex */
        public static final class C12848b implements InterfaceC14536b {

            /* renamed from: a */
            public final /* synthetic */ RxActivity f25622a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC14536b f25623b;

            /* renamed from: com.vptrm.vcvroom.utils.k$g$b$a */
            /* loaded from: classes4.dex */
            public static final class C12849a implements OnResultCallbackListener {

                /* renamed from: a */
                public final /* synthetic */ RxActivity f25624a;

                /* renamed from: b */
                public final /* synthetic */ InterfaceC14536b f25625b;

                public C12849a(RxActivity rxActivity, InterfaceC14536b interfaceC14536b) {
                    this.f25624a = rxActivity;
                    this.f25625b = interfaceC14536b;
                }

                @Override // com.luck.picture.lib.interfaces.OnResultCallbackListener
                public void onCancel() {
                }

                @Override // com.luck.picture.lib.interfaces.OnResultCallbackListener
                public void onResult(ArrayList result) {
                    String str;
                    AbstractC14656n.m8377g(result, "result");
                    AbstractC2603r.m36093i("拍照完成");
                    if (result.size() > 0) {
                        Object obj = result.get(0);
                        AbstractC14656n.m8380d(obj);
                        LocalMedia localMedia = (LocalMedia) obj;
                        if (localMedia != null) {
                            str = localMedia.getRealPath();
                        } else {
                            str = null;
                        }
                        C12839k c12839k = C12839k.f25613a;
                        RxActivity rxActivity = this.f25624a;
                        AbstractC14656n.m8380d(str);
                        c12839k.m11980k(rxActivity, str, this.f25625b);
                    }
                }
            }

            public C12848b(RxActivity rxActivity, InterfaceC14536b interfaceC14536b) {
                this.f25622a = rxActivity;
                this.f25623b = interfaceC14536b;
            }

            @Override // p413kd.InterfaceC14536b
            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                PictureSelector.create((AppCompatActivity) this.f25622a).openCamera(SelectMimeType.ofImage()).forResult(new C12849a(this.f25622a, this.f25623b));
            }

            @Override // p413kd.InterfaceC14536b
            public void onFailure(Throwable throwable) {
                AbstractC14656n.m8377g(throwable, "throwable");
                AbstractC15467c0.m6355b(AbstractC17198d.No_permission);
            }
        }

        public C12846g(RxActivity rxActivity, InterfaceC14536b interfaceC14536b, boolean z, boolean z2) {
            this.f25616a = rxActivity;
            this.f25617b = interfaceC14536b;
            this.f25618c = z;
            this.f25619d = z2;
        }

        @Override // com.vptrm.vcvroom.page.dialog.MediaIsCamearOrAlbumDialog.InterfaceC9617b
        /* renamed from: a */
        public void mo11962a() {
            C8909l0 m21818p = C8909l0.m21818p();
            RxActivity rxActivity = this.f25616a;
            m21818p.m21819o(rxActivity, new C12848b(rxActivity, this.f25617b));
        }

        @Override // com.vptrm.vcvroom.page.dialog.MediaIsCamearOrAlbumDialog.InterfaceC9617b
        /* renamed from: b */
        public void mo11961b() {
            PictureSelector.create((AppCompatActivity) this.f25616a).openGallery(SelectMimeType.ofImage()).setImageEngine(C8997l.m21597a()).setMaxSelectNum(1).isGif(this.f25618c).isWebp(this.f25619d).forResult(new C12847a(this.f25616a, this.f25617b));
        }
    }

    /* renamed from: com.vptrm.vcvroom.utils.k$h */
    /* loaded from: classes4.dex */
    public static final class C12850h implements OnResultCallbackListener {

        /* renamed from: a */
        public final /* synthetic */ boolean f25626a;

        /* renamed from: b */
        public final /* synthetic */ RxActivity f25627b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC14536b f25628c;

        public C12850h(boolean z, RxActivity rxActivity, InterfaceC14536b interfaceC14536b) {
            this.f25626a = z;
            this.f25627b = rxActivity;
            this.f25628c = interfaceC14536b;
        }

        @Override // com.luck.picture.lib.interfaces.OnResultCallbackListener
        public void onCancel() {
        }

        @Override // com.luck.picture.lib.interfaces.OnResultCallbackListener
        public void onResult(ArrayList result) {
            String realPath;
            Uri uri;
            String str;
            String str2;
            String str3;
            String str4;
            AbstractC14656n.m8377g(result, "result");
            if (result.size() > 0) {
                Object obj = result.get(0);
                AbstractC14656n.m8380d(obj);
                LocalMedia localMedia = (LocalMedia) obj;
                String str5 = null;
                if (this.f25626a) {
                    if (localMedia != null) {
                        realPath = localMedia.getCutPath();
                    }
                    realPath = null;
                } else {
                    if (localMedia != null) {
                        realPath = localMedia.getRealPath();
                    }
                    realPath = null;
                }
                if (realPath != null) {
                    uri = Uri.fromFile(new File(realPath));
                } else {
                    uri = null;
                }
                if (localMedia != null) {
                    str = localMedia.getCutPath();
                } else {
                    str = null;
                }
                if (C14721u.m8238J(String.valueOf(str), PictureMimeType.GIF, false, 2, null)) {
                    C12839k c12839k = C12839k.f25613a;
                    if (localMedia != null) {
                        str5 = localMedia.getCutPath();
                    }
                    File m11971t = c12839k.m11971t(String.valueOf(str5));
                    RxActivity rxActivity = this.f25627b;
                    AbstractC14656n.m8380d(uri);
                    c12839k.m11973r(rxActivity, uri, m11971t);
                    this.f25628c.onSuccess(m11971t.getPath());
                    return;
                }
                AbstractC2603r.m36093i("相册选择的absolutePath：" + realPath);
                AbstractC2603r.m36093i("相册选择的uriFromLocalMedia：" + uri);
                if (localMedia != null) {
                    str2 = localMedia.getAvailablePath();
                } else {
                    str2 = null;
                }
                AbstractC2603r.m36093i("相册选择的 availablePath：" + str2);
                if (localMedia != null) {
                    str3 = localMedia.getOriginalPath();
                } else {
                    str3 = null;
                }
                AbstractC2603r.m36093i("相册选择的 originalPath：" + str3);
                if (localMedia != null) {
                    str4 = localMedia.getCompressPath();
                } else {
                    str4 = null;
                }
                AbstractC2603r.m36093i("相册选择的 compressPath：" + str4);
                if (localMedia != null) {
                    str5 = localMedia.getCutPath();
                }
                AbstractC2603r.m36093i("相册选择的 realPath：" + str5);
                C12839k c12839k2 = C12839k.f25613a;
                RxActivity rxActivity2 = this.f25627b;
                AbstractC14656n.m8380d(uri);
                AbstractC14656n.m8380d(realPath);
                c12839k2.m11981j(rxActivity2, uri, realPath, this.f25628c);
            }
        }
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.utils.h.apply(java.lang.Object):java.lang.Object] */
    /* renamed from: a */
    public static /* synthetic */ List m11990a(InterfaceC14412l interfaceC14412l, Object obj) {
        return m11976o(interfaceC14412l, obj);
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.utils.e.apply(java.lang.Object):java.lang.Object] */
    /* renamed from: b */
    public static /* synthetic */ File m11989b(InterfaceC14412l interfaceC14412l, Object obj) {
        return m11979l(interfaceC14412l, obj);
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.utils.g.accept(java.lang.Object):void] */
    /* renamed from: c */
    public static /* synthetic */ void m11988c(InterfaceC14412l interfaceC14412l, Object obj) {
        m11977n(interfaceC14412l, obj);
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.utils.f.accept(java.lang.Object):void] */
    /* renamed from: d */
    public static /* synthetic */ void m11987d(InterfaceC14412l interfaceC14412l, Object obj) {
        m11978m(interfaceC14412l, obj);
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.utils.i.accept(java.lang.Object):void] */
    /* renamed from: e */
    public static /* synthetic */ void m11986e(InterfaceC14412l interfaceC14412l, Object obj) {
        m11975p(interfaceC14412l, obj);
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.utils.j.accept(java.lang.Object):void] */
    /* renamed from: f */
    public static /* synthetic */ void m11985f(InterfaceC14412l interfaceC14412l, Object obj) {
        m11974q(interfaceC14412l, obj);
    }

    /* renamed from: l */
    public static final File m11979l(InterfaceC14412l tmp0, Object obj) {
        AbstractC14656n.m8377g(tmp0, "$tmp0");
        return (File) tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m11978m(InterfaceC14412l tmp0, Object obj) {
        AbstractC14656n.m8377g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m11977n(InterfaceC14412l tmp0, Object obj) {
        AbstractC14656n.m8377g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final List m11976o(InterfaceC14412l tmp0, Object obj) {
        AbstractC14656n.m8377g(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m11975p(InterfaceC14412l tmp0, Object obj) {
        AbstractC14656n.m8377g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m11974q(InterfaceC14412l tmp0, Object obj) {
        AbstractC14656n.m8377g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m11970u(RxActivity activity, InterfaceC14536b callback) {
        AbstractC14656n.m8377g(activity, "activity");
        AbstractC14656n.m8377g(callback, "callback");
        m11969v(activity, true, true, callback);
    }

    /* renamed from: v */
    public static final void m11969v(RxActivity activity, boolean z, boolean z2, InterfaceC14536b callback) {
        AbstractC14656n.m8377g(activity, "activity");
        AbstractC14656n.m8377g(callback, "callback");
        MediaIsCamearOrAlbumDialog.f20996e.m19469a("").m19470v(new C12846g(activity, callback, z, z2)).show(activity.getSupportFragmentManager(), "");
    }

    /* renamed from: w */
    public static final void m11968w(RxActivity activity, boolean z, boolean z2, boolean z3, float f, float f2, InterfaceC14536b callback) {
        C12829c c12829c;
        AbstractC14656n.m8377g(activity, "activity");
        AbstractC14656n.m8377g(callback, "callback");
        if (z3) {
            c12829c = new C12829c(f, f2);
        } else {
            c12829c = null;
        }
        PictureSelector.create((AppCompatActivity) activity).openGallery(SelectMimeType.ofImage()).setImageEngine(C8997l.m21597a()).setCropEngine(c12829c).setMaxSelectNum(1).isGif(z).isWebp(z2).forResult(new C12850h(z3, activity, callback));
    }

    /* renamed from: x */
    public static final void m11967x(RxActivity activity, boolean z, boolean z2, boolean z3, InterfaceC14536b callback) {
        AbstractC14656n.m8377g(activity, "activity");
        AbstractC14656n.m8377g(callback, "callback");
        m11968w(activity, z, z2, z3, 1.0f, 1.0f, callback);
    }

    /* renamed from: j */
    public final void m11981j(RxActivity rxActivity, Uri uri, String str, InterfaceC14536b interfaceC14536b) {
        AbstractC2603r.m36093i("选择的文件地址：" + str);
        Flowable observeOn = Flowable.just(uri).observeOn(Schedulers.m9075io());
        final C12843d c12843d = new C12843d(rxActivity, str);
        Flowable observeOn2 = observeOn.map(new Function() { // from class: com.vptrm.vcvroom.utils.h
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C12839k.m11990a(c12843d, obj);
            }
        }).compose(rxActivity.m21454p()).observeOn(AndroidSchedulers.mainThread());
        final C12844e c12844e = new C12844e(str, rxActivity, uri, interfaceC14536b);
        Consumer consumer = new Consumer() { // from class: com.vptrm.vcvroom.utils.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12839k.m11986e(c12844e, obj);
            }
        };
        final C12845f c12845f = C12845f.f25615a;
        observeOn2.subscribe(consumer, new Consumer() { // from class: com.vptrm.vcvroom.utils.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12839k.m11985f(c12845f, obj);
            }
        });
    }

    /* renamed from: k */
    public final void m11980k(RxActivity rxActivity, String str, InterfaceC14536b interfaceC14536b) {
        Flowable observeOn = Flowable.just(str).observeOn(Schedulers.m9075io());
        final C12840a c12840a = new C12840a(rxActivity);
        Flowable observeOn2 = observeOn.map(new Function() { // from class: com.vptrm.vcvroom.utils.e
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C12839k.m11989b(c12840a, obj);
            }
        }).compose(rxActivity.m21454p()).observeOn(AndroidSchedulers.mainThread());
        final C12841b c12841b = new C12841b(interfaceC14536b);
        Consumer consumer = new Consumer() { // from class: com.vptrm.vcvroom.utils.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12839k.m11987d(c12841b, obj);
            }
        };
        final C12842c c12842c = C12842c.f25614a;
        observeOn2.subscribe(consumer, new Consumer() { // from class: com.vptrm.vcvroom.utils.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12839k.m11988c(c12842c, obj);
            }
        });
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:101:0x006f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:104:0x0075 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:122:0x0001 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* renamed from: r */
    public final void m11973r(Context context, Uri uri, File file) {
        FileDescriptor fileDescriptor;
        FileChannel channel2;
        FileChannel fileChannel = null;
        try {
            try {
                try {
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, C16558r.f33262a);
                    if (openFileDescriptor != null) {
                        fileDescriptor = openFileDescriptor.getFileDescriptor();
                    } else {
                        fileDescriptor = null;
                    }
                    channel2 = new FileInputStream(fileDescriptor).getChannel();
                } catch (FileNotFoundException e) {
                    e = e;
                    uri = 0;
                } catch (IOException e2) {
                    e = e2;
                    uri = null;
                } catch (Throwable th) {
                    th = th;
                    uri = null;
                }
                try {
                    fileChannel = new FileOutputStream(file).getChannel();
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4096);
                    while (channel2.read(allocateDirect) != -1) {
                        allocateDirect.flip();
                        fileChannel.write(allocateDirect);
                        allocateDirect.clear();
                    }
                    channel2.close();
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                } catch (FileNotFoundException e3) {
                    FileChannel fileChannel2 = fileChannel;
                    fileChannel = channel2;
                    e = e3;
                    uri = fileChannel2;
                    e.printStackTrace();
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    if (uri != 0) {
                        uri.close();
                    }
                } catch (IOException e4) {
                    FileChannel fileChannel3 = fileChannel;
                    fileChannel = channel2;
                    e = e4;
                    uri = fileChannel3;
                    e.printStackTrace();
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    if (uri != null) {
                        uri.close();
                    }
                } catch (Throwable th2) {
                    FileChannel fileChannel4 = fileChannel;
                    fileChannel = channel2;
                    th = th2;
                    uri = fileChannel4;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                            throw th;
                        }
                    }
                    if (uri != null) {
                        uri.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        }
    }

    /* renamed from: s */
    public final File m11972s() {
        String m6311b = C15486m.m6311b();
        File file = new File(m6311b + "/image");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: t */
    public final File m11971t(String localUrl) {
        AbstractC14656n.m8377g(localUrl, "localUrl");
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(Long.valueOf(new Date().getTime()));
        String m6311b = C15486m.m6311b();
        File file = new File(m6311b + "/image");
        if (!file.exists()) {
            file.mkdirs();
        }
        String str = PictureMimeType.GIF;
        if (!C14721u.m8242H(localUrl, PictureMimeType.GIF, true)) {
            str = ".jpg";
        }
        File file2 = new File(file, "IMG_" + format + str);
        if (localUrl.length() > 0) {
            File file3 = new File(localUrl);
            if (file3.exists()) {
                C13933l.m9409d(file3, file2, true, 0, 4, null);
            }
        }
        return file2;
    }
}
