package com.vptrm.vcvroom.helper;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.blankj.utilcode.util.AbstractC2603r;
import com.blankj.utilcode.util.C2564c0;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.vptrm.common.utils.MyFirebaseMessagingServiceJava;
import com.vptrm.library.app.LibApp;
import com.vptrm.vcvroom.R;
import com.vptrm.vcvroom.entity.FcmExpandEntity;
import com.vptrm.vcvroom.page.home.activity.MainActivity;
import com.vptrm.vcvroom.page.p277h5.H5Activity;
import kotlin.jvm.internal.AbstractC14648g;
import kotlin.jvm.internal.AbstractC14656n;
import kotlin.jvm.internal.C14640c0;

/* loaded from: classes3.dex */
public final class MyFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: a */
    public static final C9184a f20146a = new C9184a(null);

    /* loaded from: classes3.dex */
    public static final class MyWorker extends Worker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MyWorker(Context appContext, WorkerParameters workerParams) {
            super(appContext, workerParams);
            AbstractC14656n.m8377g(appContext, "appContext");
            AbstractC14656n.m8377g(workerParams, "workerParams");
        }

        @Override // androidx.work.Worker
        public ListenableWorker.Result doWork() {
            ListenableWorker.Result success = ListenableWorker.Result.success();
            AbstractC14656n.m8378f(success, "success()");
            return success;
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.MyFirebaseMessagingService$a */
    /* loaded from: classes3.dex */
    public static final class C9184a {
        public C9184a() {
        }

        public /* synthetic */ C9184a(AbstractC14648g abstractC14648g) {
            this();
        }
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.helper.k.accept(java.lang.Object):void] */
    /* renamed from: c */
    public static /* synthetic */ void m20748c(MyFirebaseMessagingService myFirebaseMessagingService, int i, RemoteMessage remoteMessage, NotificationCompat.Builder builder) {
        m20746e(myFirebaseMessagingService, i, remoteMessage, builder);
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.helper.l.accept(java.lang.Object):void] */
    /* renamed from: d */
    public static /* synthetic */ void m20747d(MyFirebaseMessagingService myFirebaseMessagingService, int i, RemoteMessage remoteMessage, C14640c0 c14640c0, NotificationCompat.Builder builder) {
        m20745f(myFirebaseMessagingService, i, remoteMessage, c14640c0, builder);
    }

    /* renamed from: e */
    public static final void m20746e(MyFirebaseMessagingService this$0, int i, RemoteMessage remoteMessage, NotificationCompat.Builder builder) {
        PendingIntent activity;
        AbstractC14656n.m8377g(this$0, "this$0");
        AbstractC14656n.m8377g(remoteMessage, "$remoteMessage");
        Intent intent = new Intent(this$0, MainActivity.class);
        intent.putExtra("userId", Long.parseLong("65"));
        if (Build.VERSION.SDK_INT >= 31) {
            activity = PendingIntent.getActivity(LibApp.m21481a(), i, intent, 67108864);
            AbstractC14656n.m8378f(activity, "{\n                      …                        }");
        } else {
            activity = PendingIntent.getActivity(LibApp.m21481a(), i, intent, 1073741824);
            AbstractC14656n.m8378f(activity, "{\n                      …                        }");
        }
        NotificationCompat.Builder smallIcon = builder.setSmallIcon(R.drawable.ic_launcher24_24);
        RemoteMessage.Notification notification = remoteMessage.getNotification();
        AbstractC14656n.m8380d(notification);
        NotificationCompat.Builder contentTitle = smallIcon.setContentTitle(notification.getTitle());
        RemoteMessage.Notification notification2 = remoteMessage.getNotification();
        AbstractC14656n.m8380d(notification2);
        contentTitle.setContentText(notification2.getBody()).setContentIntent(activity).setAutoCancel(true).setDefaults(1);
    }

    /* renamed from: f */
    public static final void m20745f(MyFirebaseMessagingService this$0, int i, RemoteMessage remoteMessage, C14640c0 fcmExpandEntity, NotificationCompat.Builder builder) {
        PendingIntent activity;
        AbstractC14656n.m8377g(this$0, "this$0");
        AbstractC14656n.m8377g(remoteMessage, "$remoteMessage");
        AbstractC14656n.m8377g(fcmExpandEntity, "$fcmExpandEntity");
        Intent intent = new Intent(this$0, H5Activity.class);
        intent.putExtra("KEY_H5_URL", ((FcmExpandEntity) fcmExpandEntity.element).getUrl());
        intent.putExtra("KEY_H5_TITLE", "Page");
        if (Build.VERSION.SDK_INT >= 31) {
            activity = PendingIntent.getActivity(LibApp.m21481a(), i, intent, 67108864);
            AbstractC14656n.m8378f(activity, "{\n                      …                        }");
        } else {
            activity = PendingIntent.getActivity(LibApp.m21481a(), i, intent, 1073741824);
            AbstractC14656n.m8378f(activity, "{\n                      …                        }");
        }
        NotificationCompat.Builder smallIcon = builder.setSmallIcon(R.drawable.ic_launcher24_24);
        RemoteMessage.Notification notification = remoteMessage.getNotification();
        AbstractC14656n.m8380d(notification);
        NotificationCompat.Builder contentTitle = smallIcon.setContentTitle(notification.getTitle());
        RemoteMessage.Notification notification2 = remoteMessage.getNotification();
        AbstractC14656n.m8380d(notification2);
        contentTitle.setContentText(notification2.getBody()).setContentIntent(activity).setAutoCancel(true).setDefaults(1);
    }

    /* renamed from: g */
    private final void m20744g() {
        OneTimeWorkRequest build = new OneTimeWorkRequest.Builder(MyFirebaseMessagingServiceJava.MyWorker.class).build();
        AbstractC14656n.m8378f(build, "Builder(MyFirebaseMessag…ava)\n            .build()");
        WorkManager.getInstance(this).beginWith(build).enqueue();
    }

    /* renamed from: h */
    private final void m20743h(String str) {
        AbstractC2603r.m36093i("MyFirebaseMsgService", "sendRegistrationTokenToServer(" + str + ")");
        if (str != null && str.length() > 0) {
            C2564c0.m36298b().m36284p("SP_KEY_PUSH_TOKEN", str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0131, code lost:
        if (r2.intValue() != 1) goto L20;
     */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMessageReceived(final com.google.firebase.messaging.RemoteMessage r10) {
        kotlin.jvm.internal.AbstractC14656n.m8377g(r10, "remoteMessage");
        try {
            java.lang.String r5 = r10.getFrom();
            com.google.firebase.messaging.RemoteMessage.Notification r6 = r10.getNotification();
            kotlin.jvm.internal.AbstractC14656n.m8380d(r6);
            java.lang.String r6 = r6.getTitle();
            com.blankj.utilcode.util.AbstractC2603r.m36093i("MyFirebaseMsgService", "From: " + r5 + " 标题： " + r6);
        } catch (java.lang.Exception r5) {
            com.blankj.utilcode.util.AbstractC2603r.m36093i("push msg error:" + r5);
        }
        java.util.Map<java.lang.String, java.lang.String> r5 = r10.getData();
        kotlin.jvm.internal.AbstractC14656n.m8378f(r5, "remoteMessage.data");
        if (!r5.isEmpty()) {
            java.util.Map<java.lang.String, java.lang.String> r5 = r10.getData();
            com.blankj.utilcode.util.AbstractC2603r.m36093i("MyFirebaseMsgService", "Message data payload: " + r5);
            m20744g();
        }
        com.google.firebase.messaging.RemoteMessage.Notification r5 = r10.getNotification();
        if (r5 != null) {
            java.lang.String r5 = r5.getBody();
            com.blankj.utilcode.util.AbstractC2603r.m36093i("MyFirebaseMsgService", "Message Notification Body: " + r5);
            try {
                java.util.Map<java.lang.String, java.lang.String> r5 = r10.getData();
                kotlin.jvm.internal.AbstractC14656n.m8378f(r5, "remoteMessage.data");
                if (r5 != null) {
                    java.lang.String r5 = r5.get("expand");
                    com.blankj.utilcode.util.AbstractC2603r.m36093i("MyFirebaseMsgService", "通知消息拓展数据" + r5);
                    if (r5 != null && r5.length() > 0) {
                        java.lang.reflect.Type r6 = new com.google.gson.reflect.TypeToken<com.vptrm.vcvroom.entity.FcmExpandEntity>() { // from class: com.vptrm.vcvroom.helper.MyFirebaseMessagingService$onMessageReceived$2$type$1
                            {
                            }
                        }.getType();
                        final kotlin.jvm.internal.C14640c0 r7 = new kotlin.jvm.internal.C14640c0();
                        r7.element = new com.google.gson.Gson().fromJson(r5, r6);
                        final int r5 = com.blankj.utilcode.util.C2564c0.m36298b().m36295e("SP_KEY_PUSH_NOTIFY_MSG_ID", 0) + 1;
                        com.blankj.utilcode.util.C2564c0.m36298b().m36288l("SP_KEY_PUSH_NOTIFY_MSG_ID", r5);
                        com.blankj.utilcode.util.AbstractC2603r.m36093i("MyFirebaseMsgService", "push ID: " + r5);
                        java.lang.Integer r2 = ((com.vptrm.vcvroom.entity.FcmExpandEntity) r7.element).getNotifyType();
                        if (r2 != null) {
                        }
                        java.lang.Integer r1 = ((com.vptrm.vcvroom.entity.FcmExpandEntity) r7.element).getNotifyType();
                        if (r1 != null && r1.intValue() == 3) {
                            com.blankj.utilcode.util.C2614s.m36042b(r5, new com.blankj.utilcode.util.AbstractC2585j0.InterfaceC2587b() { // from class: com.vptrm.vcvroom.helper.k
                                {
                                }

                                @Override // com.blankj.utilcode.util.AbstractC2585j0.InterfaceC2587b
                                public final void accept(java.lang.Object r4) {
                                    com.vptrm.vcvroom.helper.MyFirebaseMessagingService.m20748c(com.vptrm.vcvroom.helper.MyFirebaseMessagingService.this, r2, r3, (androidx.core.app.NotificationCompat.Builder) r4);
                                }
                            });
                            return;
                        }
                        java.lang.Integer r1 = ((com.vptrm.vcvroom.entity.FcmExpandEntity) r7.element).getNotifyType();
                        if (r1 != null && r1.intValue() == 2) {
                            com.blankj.utilcode.util.C2614s.m36042b(r5, new com.blankj.utilcode.util.AbstractC2585j0.InterfaceC2587b() { // from class: com.vptrm.vcvroom.helper.l
                                {
                                }

                                @Override // com.blankj.utilcode.util.AbstractC2585j0.InterfaceC2587b
                                public final void accept(java.lang.Object r5) {
                                    com.vptrm.vcvroom.helper.MyFirebaseMessagingService.m20747d(com.vptrm.vcvroom.helper.MyFirebaseMessagingService.this, r2, r3, r4, (androidx.core.app.NotificationCompat.Builder) r5);
                                }
                            });
                            return;
                        }
                        ((com.vptrm.vcvroom.entity.FcmExpandEntity) r7.element).getNotifyType();
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String token) {
        AbstractC14656n.m8377g(token, "token");
        AbstractC2603r.m36093i("MyFirebaseMsgService", "Refreshed token: " + token);
        if (token.length() > 0) {
            m20743h(token);
        }
    }
}
