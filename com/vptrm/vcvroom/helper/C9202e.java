package com.vptrm.vcvroom.helper;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import cg.C2289d;
import com.google.android.exoplayer2.AbstractC3784s2;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p049ui.PlayerView;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.video.VideoSize;
import com.vptrm.vcvroom.app.App;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC14656n;
import kotlin.text.C14720t;
import p413kd.InterfaceC14536b;
import p455nd.C15474h;
import p455nd.C15479j;
import p490pd.C15916b;

/* renamed from: com.vptrm.vcvroom.helper.e */
/* loaded from: classes3.dex */
public final class C9202e {

    /* renamed from: a */
    public final Context f20196a;

    /* renamed from: b */
    public final PlayerView f20197b;

    /* renamed from: c */
    public ExoPlayer f20198c;

    /* renamed from: com.vptrm.vcvroom.helper.e$a */
    /* loaded from: classes3.dex */
    public static final class C9203a implements Player.Listener {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC14536b f20200b;

        public C9203a(InterfaceC14536b interfaceC14536b) {
            this.f20200b = interfaceC14536b;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            AbstractC3784s2.m34227a(this, audioAttributes);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAudioSessionIdChanged(int i) {
            AbstractC3784s2.m34226b(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            AbstractC3784s2.m34225c(this, commands);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onCues(CueGroup cueGroup) {
            AbstractC3784s2.m34224d(this, cueGroup);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            AbstractC3784s2.m34222f(this, deviceInfo);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
            AbstractC3784s2.m34221g(this, i, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onEvents(Player player, Player.Events events) {
            AbstractC3784s2.m34220h(this, player, events);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
            AbstractC3784s2.m34219i(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
            AbstractC3784s2.m34218j(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onLoadingChanged(boolean z) {
            AbstractC3784s2.m34217k(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
            AbstractC3784s2.m34216l(this, j);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
            AbstractC3784s2.m34215m(this, mediaItem, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            AbstractC3784s2.m34214n(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMetadata(Metadata metadata) {
            AbstractC3784s2.m34213o(this, metadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            AbstractC3784s2.m34212p(this, z, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            AbstractC3784s2.m34211q(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int i) {
            PlayerView playerView;
            if (i == 3 && (playerView = C9202e.this.f20197b) != null) {
                playerView.setAlpha(0.0f);
                playerView.setVisibility(0);
                playerView.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
            }
            if (i == 4) {
                InterfaceC14536b interfaceC14536b = this.f20200b;
                if (interfaceC14536b != null) {
                    interfaceC14536b.onSuccess(1);
                }
                PlayerView playerView2 = C9202e.this.f20197b;
                if (playerView2 != null) {
                    playerView2.setVisibility(8);
                }
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            AbstractC3784s2.m34209s(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerError(PlaybackException playbackException) {
            AbstractC3784s2.m34208t(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            AbstractC3784s2.m34207u(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            AbstractC3784s2.m34206v(this, z, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            AbstractC3784s2.m34205w(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPositionDiscontinuity(int i) {
            AbstractC3784s2.m34204x(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onRenderedFirstFrame() {
            AbstractC3784s2.m34202z(this);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onRepeatModeChanged(int i) {
            AbstractC3784s2.m34239A(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekBackIncrementChanged(long j) {
            AbstractC3784s2.m34238B(this, j);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekForwardIncrementChanged(long j) {
            AbstractC3784s2.m34237C(this, j);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekProcessed() {
            AbstractC3784s2.m34236D(this);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            AbstractC3784s2.m34235E(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            AbstractC3784s2.m34234F(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
            AbstractC3784s2.m34233G(this, i, i2);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
            AbstractC3784s2.m34232H(this, timeline, i);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            AbstractC3784s2.m34231I(this, trackSelectionParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTracksChanged(Tracks tracks) {
            AbstractC3784s2.m34230J(this, tracks);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            AbstractC3784s2.m34229K(this, videoSize);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVolumeChanged(float f) {
            AbstractC3784s2.m34228L(this, f);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onCues(List list) {
            AbstractC3784s2.m34223e(this, list);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
            AbstractC3784s2.m34203y(this, positionInfo, positionInfo2, i);
        }
    }

    public C9202e(Context context, PlayerView playerView) {
        AbstractC14656n.m8377g(context, "context");
        this.f20196a = context;
        this.f20197b = playerView;
    }

    /* renamed from: b */
    public final void m20703b(String videoUri, int i, InterfaceC14536b interfaceC14536b) {
        AbstractC14656n.m8377g(videoUri, "videoUri");
        m20702c();
        if (!TextUtils.isEmpty(videoUri) && (C14720t.m8266E(videoUri, "http:", false, 2, null) || C14720t.m8266E(videoUri, "https:", false, 2, null))) {
            String m36968i = C2289d.m36968i(videoUri, "/");
            C15474h.C15475a c15475a = C15474h.f30792d;
            C15474h m6334a = c15475a.m6334a();
            App.C9159a c9159a = App.f14383A;
            String str = m6334a.m6335h("GIFT_MP4", c9159a.m21182a()) + File.separator + m36968i;
            if (!c15475a.m6334a().m6337f(str)) {
                C15479j.f30805e.m6319a().m6322e(videoUri, "GIFT_MP4", c9159a.m21182a());
            } else {
                videoUri = str;
            }
        }
        C15916b.m5060d("==视频地址===audioFileUrl==" + ((Object) videoUri));
        ExoPlayer build = new ExoPlayer.Builder(this.f20196a).build();
        build.setMediaItem(MediaItem.fromUri(videoUri));
        build.prepare();
        build.play();
        this.f20198c = build;
        PlayerView playerView = this.f20197b;
        if (playerView != null) {
            playerView.setPlayer(build);
        }
        ExoPlayer exoPlayer = this.f20198c;
        if (exoPlayer != null) {
            exoPlayer.setRepeatMode(i);
        }
        ExoPlayer exoPlayer2 = this.f20198c;
        if (exoPlayer2 != null) {
            exoPlayer2.addListener(new C9203a(interfaceC14536b));
        }
    }

    /* renamed from: c */
    public final void m20702c() {
        ExoPlayer exoPlayer = this.f20198c;
        if (exoPlayer != null) {
            exoPlayer.release();
        }
        this.f20198c = null;
    }
}
