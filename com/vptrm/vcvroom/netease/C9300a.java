package com.vptrm.vcvroom.netease;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.blankj.utilcode.util.AbstractC2585j0;
import com.google.android.gms.common.ConnectionResult;
import com.netease.nim.uikit.api.wrapper.MessageRevokeTip;
import com.netease.nim.uikit.api.wrapper.NimUserInfoProvider;
import com.netease.nim.uikit.business.session.viewholder.MsgViewHolderThumbBase;
import com.netease.nimlib.sdk.NotificationFoldStyle;
import com.netease.nimlib.sdk.SDKOptions;
import com.netease.nimlib.sdk.StatusBarNotificationConfig;
import com.netease.nimlib.sdk.msg.MessageNotifierCustomization;
import com.netease.nimlib.sdk.msg.constant.NotificationExtraTypeEnum;
import com.netease.nimlib.sdk.msg.model.IMMessage;
import com.vptrm.vcvroom.R;
import com.vptrm.vcvroom.page.splash.VptWelcomeActivity;
import java.io.IOException;
import p594wc.C17195a;

/* renamed from: com.vptrm.vcvroom.netease.a */
/* loaded from: classes3.dex */
public class C9300a {

    /* renamed from: a */
    public static final MessageNotifierCustomization f20342a = new C9301a();

    /* renamed from: com.vptrm.vcvroom.netease.a$a */
    /* loaded from: classes3.dex */
    public class C9301a implements MessageNotifierCustomization {
        @Override // com.netease.nimlib.sdk.msg.MessageNotifierCustomization
        public String makeCategory(IMMessage iMMessage) {
            return null;
        }

        @Override // com.netease.nimlib.sdk.msg.MessageNotifierCustomization
        public String makeNotifyContent(String str, IMMessage iMMessage) {
            return null;
        }

        @Override // com.netease.nimlib.sdk.msg.MessageNotifierCustomization
        public String makeRevokeMsgTip(String str, IMMessage iMMessage) {
            return MessageRevokeTip.getRevokeTipContent(iMMessage, str);
        }

        @Override // com.netease.nimlib.sdk.msg.MessageNotifierCustomization
        public String makeTicker(String str, IMMessage iMMessage) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m20496a(SDKOptions sDKOptions, Context context) {
        String m1793k = C17195a.m1793k();
        if (!TextUtils.isEmpty(m1793k)) {
            sDKOptions.appKey = m1793k;
        }
    }

    /* renamed from: b */
    public static String m20495b(Context context) {
        String str = null;
        try {
            if (context.getExternalCacheDir() != null) {
                str = context.getExternalCacheDir().getCanonicalPath();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (TextUtils.isEmpty(str)) {
            return Environment.getExternalStorageDirectory() + "/" + AbstractC2585j0.m36226a().getPackageName();
        }
        return str;
    }

    /* renamed from: c */
    public static SDKOptions m20494c(Context context) {
        SDKOptions sDKOptions = new SDKOptions();
        m20493d(sDKOptions);
        sDKOptions.preloadAttach = true;
        sDKOptions.thumbnailSize = MsgViewHolderThumbBase.getImageMaxEdge();
        sDKOptions.userInfoProvider = new NimUserInfoProvider(AbstractC2585j0.m36226a().getApplicationContext());
        sDKOptions.messageNotifierCustomization = f20342a;
        sDKOptions.sessionReadAck = true;
        sDKOptions.animatedImageThumbnailEnabled = true;
        sDKOptions.asyncInitSDK = true;
        sDKOptions.reducedIM = false;
        sDKOptions.checkManifestConfig = false;
        sDKOptions.enableTeamMsgAck = true;
        sDKOptions.shouldConsiderRevokedMessageUnreadCount = true;
        sDKOptions.disableAwake = true;
        m20496a(sDKOptions, context);
        sDKOptions.useXLog = false;
        sDKOptions.notifyStickTopSession = true;
        return sDKOptions;
    }

    /* renamed from: d */
    public static void m20493d(SDKOptions sDKOptions) {
        sDKOptions.statusBarNotificationConfig = m20492e();
    }

    /* renamed from: e */
    public static StatusBarNotificationConfig m20492e() {
        StatusBarNotificationConfig statusBarNotificationConfig = new StatusBarNotificationConfig();
        statusBarNotificationConfig.notificationEntrance = VptWelcomeActivity.class;
        statusBarNotificationConfig.notificationSmallIconId = R.mipmap.logo;
        statusBarNotificationConfig.notificationColor = AbstractC2585j0.m36226a().getResources().getColor(R.color.color_activity_blue_bg);
        statusBarNotificationConfig.notificationSound = "android.resource://com.gzxkwl.hochat/raw/msg";
        statusBarNotificationConfig.notificationFolded = true;
        statusBarNotificationConfig.notificationFoldStyle = NotificationFoldStyle.ALL;
        statusBarNotificationConfig.downTimeEnableNotification = true;
        statusBarNotificationConfig.notificationExtraType = NotificationExtraTypeEnum.JSON_ARR_STR;
        statusBarNotificationConfig.ledARGB = -16711936;
        statusBarNotificationConfig.ledOnMs = 1000;
        statusBarNotificationConfig.ledOffMs = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        statusBarNotificationConfig.showBadge = true;
        return statusBarNotificationConfig;
    }
}
