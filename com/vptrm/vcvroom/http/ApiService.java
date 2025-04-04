package com.vptrm.vcvroom.http;

import com.netease.nim.uikit.business.attachment.CustomerServiceQuestionEntity;
import com.vptrm.common.entity.CircleCommentEntity;
import com.vptrm.common.entity.ClientEntity;
import com.vptrm.common.entity.ConfigEntity;
import com.vptrm.common.entity.CrystalBalanceEntity;
import com.vptrm.common.entity.GameJoyEntity;
import com.vptrm.common.entity.GameMangoEntity;
import com.vptrm.common.entity.HoAnchorEntity;
import com.vptrm.common.entity.HoUserRankEntity;
import com.vptrm.common.entity.LiveConnectUserEntity;
import com.vptrm.common.entity.LoginCountryEntity;
import com.vptrm.common.entity.LoginEntity;
import com.vptrm.common.entity.LuckyRankEntity;
import com.vptrm.common.entity.MyVideoChatRoomEntity;
import com.vptrm.common.entity.NewRankEntity;
import com.vptrm.common.entity.RoomAdminEntity;
import com.vptrm.common.entity.RoomIndexRankEntity;
import com.vptrm.common.entity.SVipEntity;
import com.vptrm.common.entity.SigninDetailEntity;
import com.vptrm.common.entity.ThemeBgEntity;
import com.vptrm.common.entity.UserEntity;
import com.vptrm.common.entity.VptGuildInfoEntity;
import com.vptrm.common.entity.VptMicEmojiEntity;
import com.vptrm.common.entity.VptMusicEntity;
import com.vptrm.common.entity.VptNobleEntity;
import com.vptrm.common.entity.VptRoomActEntity;
import com.vptrm.common.entity.VptUserCpInfoVo;
import com.vptrm.common.entity.VptUserEntity;
import com.vptrm.common.entity.VptUserLevelEntity;
import com.vptrm.library.entity.BalanceEntity;
import com.vptrm.library.entity.LuckyGiftMultipleEntity;
import com.vptrm.library.entity.RoomChatGiftEntity;
import com.vptrm.library.entity.SGateEntity;
import com.vptrm.library.entity.VptMallEntity;
import com.vptrm.library.http.HttpResult;
import com.vptrm.vcvroom.entity.AdEntity;
import com.vptrm.vcvroom.entity.AllServersEntity;
import com.vptrm.vcvroom.entity.BDCenterDetailsEntity;
import com.vptrm.vcvroom.entity.BDCenterHeadDetailsEntity;
import com.vptrm.vcvroom.entity.BDFamilyHomeEntity;
import com.vptrm.vcvroom.entity.BDMemberDetailEntity;
import com.vptrm.vcvroom.entity.BannerCardEntity;
import com.vptrm.vcvroom.entity.BillEntity;
import com.vptrm.vcvroom.entity.BlackEntity;
import com.vptrm.vcvroom.entity.CallRecordEntity;
import com.vptrm.vcvroom.entity.CampaignCpCumulativeEntity;
import com.vptrm.vcvroom.entity.CampaignCpRulesEntity;
import com.vptrm.vcvroom.entity.ChargingListEntity;
import com.vptrm.vcvroom.entity.ChatInfoEntity;
import com.vptrm.vcvroom.entity.CloseMicEntity;
import com.vptrm.vcvroom.entity.CrystalRecordEntity;
import com.vptrm.vcvroom.entity.CurrentSignKeyEntity;
import com.vptrm.vcvroom.entity.CustomerServiceEntity;
import com.vptrm.vcvroom.entity.DailyTaskEntity;
import com.vptrm.vcvroom.entity.EstimatedListEntity;
import com.vptrm.vcvroom.entity.ExpiredGoodsEntity;
import com.vptrm.vcvroom.entity.FamilyMemberEntity;
import com.vptrm.vcvroom.entity.FamilyRankEntity;
import com.vptrm.vcvroom.entity.FamilySalaryListEntity;
import com.vptrm.vcvroom.entity.FeedBackRecordDetailEntity;
import com.vptrm.vcvroom.entity.FeedBackRecordEntity;
import com.vptrm.vcvroom.entity.FirstChargeGiftEntity;
import com.vptrm.vcvroom.entity.FirstRechargeEntity;
import com.vptrm.vcvroom.entity.FlowDetailsEntity;
import com.vptrm.vcvroom.entity.FollowAnchorLiveListEntity;
import com.vptrm.vcvroom.entity.FollowAnchorOpenLiveEntity;
import com.vptrm.vcvroom.entity.GiftCardEntity;
import com.vptrm.vcvroom.entity.GuildAccountDetailEntity;
import com.vptrm.vcvroom.entity.GuildApplicationRecordEntity;
import com.vptrm.vcvroom.entity.GuildInfoEntity;
import com.vptrm.vcvroom.entity.GuildInviteRewardOrMemberEntity;
import com.vptrm.vcvroom.entity.GuildListEntity;
import com.vptrm.vcvroom.entity.GuildSearchEntity;
import com.vptrm.vcvroom.entity.HoEggRankEntity;
import com.vptrm.vcvroom.entity.HoGuildInviteDetailEntity;
import com.vptrm.vcvroom.entity.HoHomeTagListEntity;
import com.vptrm.vcvroom.entity.HoIndexTabEntity;
import com.vptrm.vcvroom.entity.HoPhotoAlbumEntity;
import com.vptrm.vcvroom.entity.HoRoomBannerEntity;
import com.vptrm.vcvroom.entity.HoRoomGameEggEntity;
import com.vptrm.vcvroom.entity.HoRoomUserCharmEntity;
import com.vptrm.vcvroom.entity.HoSmashEggResultEntity;
import com.vptrm.vcvroom.entity.HoTransferOrderRecordEntity;
import com.vptrm.vcvroom.entity.HoVChatCreateRoomEntity;
import com.vptrm.vcvroom.entity.HomeRechargeRankEntity;
import com.vptrm.vcvroom.entity.IndexVoiceChatRoomEntity;
import com.vptrm.vcvroom.entity.InviteAnchorDetailEntity;
import com.vptrm.vcvroom.entity.InviteAnchorListEntity;
import com.vptrm.vcvroom.entity.InviteGuildMemberEntity;
import com.vptrm.vcvroom.entity.InviteInfoEntity;
import com.vptrm.vcvroom.entity.LevelUpInfo;
import com.vptrm.vcvroom.entity.LiveApplyConnectionStatusEntity;
import com.vptrm.vcvroom.entity.LiveIntervalSecEntity;
import com.vptrm.vcvroom.entity.LoginAccountListEntity;
import com.vptrm.vcvroom.entity.LuckyGiftWinRecordEntity;
import com.vptrm.vcvroom.entity.LuckyJoinEntity;
import com.vptrm.vcvroom.entity.LudoGameStateEntity;
import com.vptrm.vcvroom.entity.MatchDefPriceEntity;
import com.vptrm.vcvroom.entity.MayPolicyEntity;
import com.vptrm.vcvroom.entity.MedalStatEntity;
import com.vptrm.vcvroom.entity.MicThemeEntity;
import com.vptrm.vcvroom.entity.MicTypeEntity;
import com.vptrm.vcvroom.entity.MyFamilyEntity;
import com.vptrm.vcvroom.entity.MyVisitorListEntity;
import com.vptrm.vcvroom.entity.MyVisitorStatEntity;
import com.vptrm.vcvroom.entity.MyWalletEntity;
import com.vptrm.vcvroom.entity.MyWithdrawAccountEntity;
import com.vptrm.vcvroom.entity.OfficialWithdrawalRecordEntity;
import com.vptrm.vcvroom.entity.PaidEntity;
import com.vptrm.vcvroom.entity.PrettyEntity;
import com.vptrm.vcvroom.entity.QueryGuildInviteEntity;
import com.vptrm.vcvroom.entity.RankListEntity;
import com.vptrm.vcvroom.entity.RankUserIconEntity;
import com.vptrm.vcvroom.entity.RegionEntity;
import com.vptrm.vcvroom.entity.RocketAactEntity;
import com.vptrm.vcvroom.entity.RocketRewardEntity;
import com.vptrm.vcvroom.entity.RoomAnchorEntity;
import com.vptrm.vcvroom.entity.RoomChatRankEntity;
import com.vptrm.vcvroom.entity.RoomChatSeatDetailDTO;
import com.vptrm.vcvroom.entity.RoomConnectionListEntity;
import com.vptrm.vcvroom.entity.RoomIncomeEntity;
import com.vptrm.vcvroom.entity.RoomInfoEntity;
import com.vptrm.vcvroom.entity.RoomMicThemeEntity;
import com.vptrm.vcvroom.entity.RoomRedPackageEntity;
import com.vptrm.vcvroom.entity.RoomRobotEntity;
import com.vptrm.vcvroom.entity.RoomUserStateEntity;
import com.vptrm.vcvroom.entity.RoomWordSensitiveEnrity;
import com.vptrm.vcvroom.entity.SVipSignInEntity;
import com.vptrm.vcvroom.entity.SVipSubEntity;
import com.vptrm.vcvroom.entity.ScoreLabelEntity;
import com.vptrm.vcvroom.entity.SearchRoomResultEntity;
import com.vptrm.vcvroom.entity.SendGiftRankingEntity;
import com.vptrm.vcvroom.entity.StationInfoEntity;
import com.vptrm.vcvroom.entity.StatusEntity;
import com.vptrm.vcvroom.entity.SubVIPEntity;
import com.vptrm.vcvroom.entity.SwitchPlayEntity;
import com.vptrm.vcvroom.entity.TaskInfoEntity;
import com.vptrm.vcvroom.entity.TaskOnlineEntity;
import com.vptrm.vcvroom.entity.TradeListEntity;
import com.vptrm.vcvroom.entity.TradeSimpleUserEntity;
import com.vptrm.vcvroom.entity.TradeTypeEntity;
import com.vptrm.vcvroom.entity.TurnableGameEntity;
import com.vptrm.vcvroom.entity.TurnableGameKindEntity;
import com.vptrm.vcvroom.entity.TurntableCurrResultEntity;
import com.vptrm.vcvroom.entity.TurntableMyRecordEntity;
import com.vptrm.vcvroom.entity.UnionRoomCupEntity;
import com.vptrm.vcvroom.entity.UpdateEntity;
import com.vptrm.vcvroom.entity.UserDetailCpFriendEntity;
import com.vptrm.vcvroom.entity.UserMessageEntity;
import com.vptrm.vcvroom.entity.VipLevelAwardEntity;
import com.vptrm.vcvroom.entity.VptCampaignCpEntity;
import com.vptrm.vcvroom.entity.VptCampaignCpHistoryEntity;
import com.vptrm.vcvroom.entity.VptCampaignGiftAwardEntity;
import com.vptrm.vcvroom.entity.VptCampaignInfoEntity;
import com.vptrm.vcvroom.entity.VptCampaignRankUserEntity;
import com.vptrm.vcvroom.entity.VptCampaignRechargeAwardEntity;
import com.vptrm.vcvroom.entity.VptCampaignRechargeInfoEntity;
import com.vptrm.vcvroom.entity.VptCampaignRechargeUserEntity;
import com.vptrm.vcvroom.entity.VptCpRankEntity;
import com.vptrm.vcvroom.entity.VptCreatePkGameEntity;
import com.vptrm.vcvroom.entity.VptFollowRoomEntity;
import com.vptrm.vcvroom.entity.VptGiftWallEntity;
import com.vptrm.vcvroom.entity.VptGuildMemberIncomeLogEntity;
import com.vptrm.vcvroom.entity.VptHomeGameEntity;
import com.vptrm.vcvroom.entity.VptHomeTagEntity;
import com.vptrm.vcvroom.entity.VptInviteEntity;
import com.vptrm.vcvroom.entity.VptInviteRewardDetailsEntity;
import com.vptrm.vcvroom.entity.VptMedalDetailEntity;
import com.vptrm.vcvroom.entity.VptMyGuildAllStatisticsEntity;
import com.vptrm.vcvroom.entity.VptMyGuildMemberEntity;
import com.vptrm.vcvroom.entity.VptMyGuildTotalIncomeEntity;
import com.vptrm.vcvroom.entity.VptMyPrivilegesEntity;
import com.vptrm.vcvroom.entity.VptNobleDetailEntity;
import com.vptrm.vcvroom.entity.VptPurseAllChangeTypeEntity;
import com.vptrm.vcvroom.entity.VptRankRewardEntity;
import com.vptrm.vcvroom.entity.VptRecommendRoomEntity;
import com.vptrm.vcvroom.entity.VptRoomGameLuckyEntity;
import com.vptrm.vcvroom.entity.VptSupporterListBean;
import com.vptrm.vcvroom.entity.VptUpdateEntity;
import com.vptrm.vcvroom.entity.VptWeekStartGiftEntity;
import com.vptrm.vcvroom.entity.VptWeekStartRankingEntity;
import com.vptrm.vcvroom.entity.VptWeekStartRewardEntity;
import com.vptrm.vcvroom.entity.WalletCommonRecordEntity;
import com.vptrm.vcvroom.entity.WithdrawRecordEntity;
import com.vptrm.vcvroom.entity.game.DailyGameWinEntity;
import com.vptrm.vcvroom.entity.game.MainLoopEntity;
import com.vptrm.vcvroom.entity.game.RecentPrizeEntity;
import com.vptrm.vcvroom.entity.game.SmkGameInfo;
import com.vptrm.vcvroom.entity.game.SmkGameResultEntity;
import com.vptrm.vcvroom.entity.game.SmkPrizeRecordEntity;
import com.vptrm.vcvroom.entity.game.SmkRankingEntity;
import com.vptrm.vcvroom.entity.game.WarKingHotEntity;
import com.vptrm.vcvroom.entity.game.WarKingLotteryEntity;
import com.vptrm.vcvroom.entity.room.RoomCreatePkEntity;
import com.vptrm.vcvroom.entity.room.RoomCupEntity;
import com.vptrm.vcvroom.entity.room.RoomPkDurationEntity;
import com.vptrm.vcvroom.entity.room.RoomPkInfoEntity;
import com.vptrm.vcvroom.entity.room.RoomPkInviteEntity;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Url;

/* loaded from: classes3.dex */
public interface ApiService {
    @POST("{url}")
    Observable<HttpResult<Void>> acceptCp(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<VptCampaignRankUserEntity>> actRankList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> addPhoto(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> addUpOnlineTime(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> addWithdrawAccount(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> alterRoomInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST
    Observable<HttpResult<LevelUpInfo>> anchorAutoLevelUpInfo(@Url String str);

    @POST("{url}")
    Observable<HttpResult<Object>> applyConnection(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<LiveApplyConnectionStatusEntity>> applyConnectionStatus(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> applyForAnchor(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<String>> applyOffMic(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<String>> applyOnMic(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> applyWithdraw(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptCampaignGiftAwardEntity>>> awardGearList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RocketRewardEntity>> awardInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> batchLockMike(@Path("url") String str, @Body Map<String, Object> map);

    @POST
    Observable<HttpResult<Void>> batchSend(@Url String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> batchUnlockMike(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> behalfRechargeOrderCreate(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<TradeListEntity>>> behalfRechargeOrderQuery(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<SmkGameInfo>> betFood(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> bindUserRoomRelation(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> blockUsers(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<MicThemeEntity>> buyMicType(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Object>> cancelOfficialWithdrawal(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Boolean>> changeWearStatu(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> clearUserRoomCharisma(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptCampaignRechargeAwardEntity>>> compaignRechargeAwardList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<LiveIntervalSecEntity>> connectionHeartbeat(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RoomConnectionListEntity>> connectionList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptCampaignCpHistoryEntity>>> cpHistoryCpRankingList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Integer>> createCircle(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Object>> createFamily(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> createMyRoomAct(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RoomCreatePkEntity>> createPk(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<VptCreatePkGameEntity>> createPkGame(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<HoVChatCreateRoomEntity>> createRoom(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<CrystalRecordEntity>>> crystalRecordLog(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Object>> diamondOrderHandle(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<HoTransferOrderRecordEntity>>> diamondOrderList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Object>> disbandFamily(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<Void>> diyRoomBackgroundApply(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<HoEggRankEntity>>> eggRanking(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> exchangeIntegral(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Boolean>> existValidAct(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<FamilyRankEntity>> familyRankList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<FamilySalaryListEntity>>> familySalaryList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> feedback(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<FeedBackRecordEntity>>> feedbackList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<FeedBackRecordDetailEntity>>> feedbackReplyList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<IndexVoiceChatRoomEntity>>> findRoomListByTag(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<ChargingListEntity>>> firstLevelUserList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> follow(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<WarKingHotEntity>>> foodStateHot(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<RoomChatRankEntity.RoomRankingUserVOSDTO>>> gameRankList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<AdEntity>> getAdvertisement(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptPurseAllChangeTypeEntity>>> getAllChangeType(@Path("url") String str, @Body Map<String, Object> map);

    @GET("{url}")
    Observable<HttpResult<MayPolicyEntity>> getAnchorActList(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<List<HoAnchorEntity>>> getAnchorList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ConfigEntity>> getAppConfig(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<HoRoomBannerEntity>>> getAppPicByType(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Integer>> getAwardAmount(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptCampaignRechargeUserEntity>>> getAwardGearGetRecord(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<BannerCardEntity>> getBannerCard(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<BDCenterHeadDetailsEntity>> getBdHead(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<BlackEntity>>> getBlacklist(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<StatusEntity>> getBlockStatus(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<CallRecordEntity>>> getCallRecord(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<UserEntity>>> getCallRecordV2UserEntity(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<UserEntity>>> getCallRecordV3(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ClientEntity>> getClientInfo(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<ArrayList<CampaignCpRulesEntity>>> getCpLevelList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<CrystalBalanceEntity>> getCrystalBalance(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<CurrentSignKeyEntity>> getCurrentSignKey(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<ArrayList<CustomerServiceEntity>>> getCustomerServiceList(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<ArrayList<CustomerServiceQuestionEntity>>> getCustomerServiceQuestionList(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<DailyGameWinEntity>> getDailyGameWin(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<MicThemeEntity>> getDefault(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<FamilyMemberEntity>>> getFamilyMemberList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<FirstRechargeEntity>> getFirstRechargeState(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<FlowDetailsEntity>> getFlowList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<HoRoomGameEggEntity>> getGameByRoomId(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<SmkGameResultEntity>> getGameResult(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<NewRankEntity>> getGetNewRankList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<GuildApplicationRecordEntity>>> getGuildApplyList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptMedalDetailEntity>>> getHasWearMedalList(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<BDCenterHeadDetailsEntity>> getHeadGuildAnchor(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<HoHomeTagListEntity>> getHomeTagList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<String>> getImNoticeRoomId(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<EstimatedListEntity>> getIncomeDetail(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<HoIndexTabEntity>> getIndexTab(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptHomeTagEntity>>> getIndexVoiceChatTag(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<InviteAnchorDetailEntity>> getInviteAnchorDetail(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<InviteAnchorListEntity>> getInviteAnchorList(@Path("url") String str, @Body Map<String, Object> map);

    @POST
    Observable<HttpResult<InviteInfoEntity>> getInviteInfo(@Url String str);

    @POST("{url}")
    Observable<HttpResult<RoomPkInviteEntity>> getInviteList(@Path("url") String str, @Body Map<String, Object> map);

    @GET("{url}")
    Observable<HttpResult<Boolean>> getIsSign(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<GameJoyEntity>> getJoyGameUserToken(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<StationInfoEntity>>> getLoadList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<VptRoomGameLuckyEntity>> getLuckyGameState(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<LuckyGiftMultipleEntity>>> getLuckyGiftMultipleList(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<ArrayList<LuckyGiftWinRecordEntity>>> getLuckyGiftWinRecordList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<VptMedalDetailEntity>> getMedalInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<VptMedalDetailEntity>>> getMedalList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<MedalStatEntity>> getMedalStat(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptCpRankEntity>>> getMoCpRanking(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptUserCpInfoVo>>> getMoCpRanking1(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptMyGuildTotalIncomeEntity>>> getMyGuildTotalIncome(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<VptMedalDetailEntity>>> getMyMedalList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<VptMyPrivilegesEntity>> getMyUserPrivileges(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<List<VptMallEntity>>> getMyVirtualGoodList(@Path("url") String str, @Body Map<String, Object> map);

    @POST
    Observable<HttpResult<MyWalletEntity>> getMyWallet(@Url String str);

    @POST("{url}")
    Observable<HttpResult<VptNobleDetailEntity>> getNoblePrivileges(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> getNoblePurse(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptNobleEntity>>> getNobletLevels(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<ArrayList<OfficialWithdrawalRecordEntity>>> getOfficialWithdrawalRecord(@Path("url") String str, @Body Map<String, Object> map);

    @POST
    Observable<HttpResult<Object>> getOnlineReward(@Url String str, @Body Map<String, Object> map);

    @POST
    Call<ResponseBody> getOpenTest(@Url String str);

    @POST("{url}")
    Observable<HttpResult<ArrayList<PaidEntity>>> getPaidDetail(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<HoPhotoAlbumEntity>>> getPhotos(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<RoomPkDurationEntity>>> getPkDurationList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<PrettyEntity>> getPretty(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<SmkPrizeRecordEntity>>> getPrizeRecord(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<AllServersEntity>>> getPublicScreenMsg(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RocketAactEntity>> getRankType(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RankListEntity>> getRankingList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<RecentPrizeEntity>>> getRecentPrize(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<HomeRechargeRankEntity>>> getRechargeRankList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<IndexVoiceChatRoomEntity>>> getRecommendRoomList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<RegionEntity>>> getRegionList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<UserEntity>> getRelation(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> getReviewInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<HoRoomBannerEntity>>> getRoomBannerList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<LiveConnectUserEntity>> getRoomCallInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RoomCupEntity>> getRoomCupInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RoomInfoEntity>> getRoomExpand(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RoomUserStateEntity>> getRoomUserState(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<String>> getRtcToken(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<SGateEntity>>> getSGatePayTypes(@Path("url") String str, @Body Map<String, Object> map);

    @GET("{url}")
    Observable<HttpResult<SVipEntity>> getSVipInfo(@Path("url") String str);

    @GET("{url}")
    Observable<HttpResult<SVipSignInEntity>> getSVipSignInInfo(@Path("url") String str);

    @GET("{url}")
    Observable<HttpResult<SVipSubEntity>> getSVipSub(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<SmkGameInfo>> getSmkInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptSupporterListBean>>> getSupporterList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<DailyTaskEntity>>> getTaskProgress(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<Void>> getTaskReward(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<SmkRankingEntity>>> getTodayRank(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<GameMangoEntity>> getTokenLingXian(@Path(encoded = true, value = "url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VipLevelAwardEntity>>> getUniversalUserLevelList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<SmkGameInfo>> getUserGameState(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<VptInviteRewardDetailsEntity>>> getUserInviteAwardRecord(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<VptInviteEntity>> getUserInviteAwardStat(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<ArrayList<UserMessageEntity>>> getUserMessageList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<HoUserRankEntity>>> getUserRank(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> getVirtualGoodApply(@Path(encoded = true, value = "url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<VptMallEntity>>> getVirtualGoodList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptWeekStartGiftEntity>>> getWeekStarGift(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<WithdrawRecordEntity>>> getWithdrawRecord(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<WarKingLotteryEntity>>> getWkRecentPrize(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<GiftCardEntity>> giftCard(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptGiftWallEntity>>> giftWall(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RoomRedPackageEntity>> giveRedEnvelopes(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<BalanceEntity>> givingGifts(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Integer>> grabRedEnvelope(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Object>> guildApplyOperate(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Object>> guildApplySubmit(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<BDCenterDetailsEntity>>> guildList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Object>> guildMemberKickOut(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<GuildSearchEntity>>> guildRecommendList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> handleGuildInvite(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Object>> heartbeat(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<InviteGuildMemberEntity>> inviteGuildMember(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Object>> invitePk(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Boolean>> isJoinGuild(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<Boolean>> isOpenPkSwitch(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RoomInfoEntity>> joinRoom(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<String>> joinRoomSuccessNotifyServer(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<TradeSimpleUserEntity>> joinUnion(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> kickMike(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> kickRoom(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> likeSave(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<SwitchPlayEntity>> liveRoomOperate(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RoomChatGiftEntity>> lockOneMike(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> loginAccountBind(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<LoginAccountListEntity>>> loginAccountList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<LoginCountryEntity>> loginCountry(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<LoginEntity>> loginQuick(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<LoginEntity>> loginVisit(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<LuckyRankEntity>>> luckyRankList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<LudoGameStateEntity>> ludoGameState(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<MainLoopEntity>> mainLoop(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> mikeHeartbeat(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptMusicEntity>>> musicCollectList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Object>> musicCollectRemove(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Object>> musicCollectSave(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<ExpiredGoodsEntity>>> myExpiredGoods(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptRoomActEntity>>> myReleaseList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptRoomActEntity>>> mySubscribeList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<RoomPkInfoEntity>>> pkSquareList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<RoomIndexRankEntity>>> platformRankingList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<FirstChargeGiftEntity>>> queryAwardPackProps(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<BDFamilyHomeEntity>> queryBDGuild(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RoomChatRankEntity>> queryCharmRanking(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<CircleCommentEntity>>> queryCircleComment(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<IndexVoiceChatRoomEntity>>> queryConcernedRoom(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<CampaignCpCumulativeEntity>> queryCpAccumulationRanking(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<VptCampaignCpEntity>> queryCurrentCpActivity(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<List<ThemeBgEntity>>> queryDiyRoomBackgroundList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<FollowAnchorLiveListEntity>> queryFollowAnchorLiveList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<FollowAnchorOpenLiveEntity>> queryFollowAnchorOpenLive(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<GuildSearchEntity>> queryGuild(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<QueryGuildInviteEntity>> queryGuildInvite(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<TurnableGameKindEntity>>> queryHistoricalLotteryRecord(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<VptCpRankEntity>>> queryIndexCpRanking(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RoomRobotEntity>> queryLiveRobotUserInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<IndexVoiceChatRoomEntity>>> queryManageRoom(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<IndexVoiceChatRoomEntity>>> queryMeLatestRoom(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<BDMemberDetailEntity>>> queryMemberDetail(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RoomMicThemeEntity>> queryMicAll(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<MicTypeEntity>> queryMicType(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<MicTypeEntity>>> queryMicTypeList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<RoomChatSeatDetailDTO>>> queryMikeInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<MyFamilyEntity>> queryMyGuild(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<MyVideoChatRoomEntity>> queryMyRoom(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<GuildInfoEntity>> queryMyUnion(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<ArrayList<RoomChatRankEntity.RoomRankingUserVOSDTO>>> queryNobleRanking(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<GameMangoEntity>> queryNormalGameUserToken(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<VptCreatePkGameEntity>> queryPkInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<VptRankRewardEntity>> queryRankingAwardAndLastWeekDetail(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Integer>> queryRedEnvelopeState(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<UserEntity>>> queryRelationUserList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<RoomChatRankEntity.RoomRankingUserVOSDTO>>> queryRichRanking(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<RoomAdminEntity>>> queryRoomAdminUser(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RoomAnchorEntity>> queryRoomAnchorStat(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<ThemeBgEntity>>> queryRoomBackgroundList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<SearchRoomResultEntity>> queryRoomByCode(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<SearchRoomResultEntity>> queryRoomByUserId(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RoomIncomeEntity>> queryRoomIncome(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<RoomAdminEntity>>> queryRoomMuteUser(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RoomPkInfoEntity>> queryRoomPk(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<RoomChatRankEntity.RoomRankingUserVOSDTO>>> queryRoomRanking(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<SendGiftRankingEntity>>> querySendGiftRanking(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<TradeSimpleUserEntity>> querySimpleUserById(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<TurntableMyRecordEntity>>> queryTurntableJoinRecord(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<TurntableCurrResultEntity>> queryTurntableResult(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<GuildAccountDetailEntity>> queryUnionAccountDetail(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<HoGuildInviteDetailEntity>> queryUnionInviteDetail(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<List<GuildInviteRewardOrMemberEntity>>> queryUnionInviteRewardList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<GuildInviteRewardOrMemberEntity>>> queryUnionInviteUserList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<UnionRoomCupEntity>> queryUnionRoomCup(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Integer>> queryUnionStatisticalNum(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<GuildListEntity>>> queryUnionUserList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<VptFollowRoomEntity>> queryUserInTheRoom(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<UserEntity>> queryUserInfoByUserNumber(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptMusicEntity>>> queryUserMusic(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<HoRoomUserCharmEntity>>> queryUserRoomCharismaReport(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<TurnableGameEntity>>> queryturntableGameList(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<RankUserIconEntity>> rankUserIconList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> ratingScore(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Integer>> receiveAward(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> receiveDiamond(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<Void>> registerInviteCode(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> rejectCp(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<UserDetailCpFriendEntity>> relationShowByType(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> removeBlockUser(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> removePhoto(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> reportVideo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<BillEntity>> requestBillDetails(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<BillEntity>>> requestBillList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ChatInfoEntity>> requestCallInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<String>>> requestCountryList(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<ArrayList<UserEntity>>> requestFollowList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<UserEntity>>> requestGetCallRecord(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<RoomChatSeatDetailDTO>>> requestLastMicStatusBySelf(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<MatchDefPriceEntity>> requestMatchPrice(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<ArrayList<UserEntity>>> requestNewUserList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<ScoreLabelEntity>>> requestScoreList(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<ArrayList<SubVIPEntity>>> requestSubVipList(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<UserEntity>> requestUserDetail(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<UpdateEntity>> requestVersionInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> rescindCpPay(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> resetJoinPassword(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<Void>> robotSendMsg(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RocketAactEntity>> rocketAactInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<RoomChatGiftEntity>>> roomChatGiftList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RoomChatGiftEntity>> roomChatSendGift(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RoomChatGiftEntity>> roomChatSendGiftCpKeepsake(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<RoomAdminEntity>>> roomChatqueryBlackUserList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<RoomAdminEntity>>> roomChatqueryOnlineUserInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<CloseMicEntity>> roomCloseMic(@Path("url") String str, @Body Map<String, Object> map);

    @GET("{url}")
    Observable<HttpResult<String>> roomEmojiList(@Path("url") String str);

    @GET("{url}")
    Observable<List<VptMicEmojiEntity>> roomEmojiListNew(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<VptRoomGameLuckyEntity>> roomLuckyClose(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<VptRoomGameLuckyEntity>> roomLuckyCreate(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<LuckyJoinEntity>>> roomLuckyJoin(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<VptRoomGameLuckyEntity>> roomLuckyStart(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<RoomChatRankEntity.RoomRankingUserVOSDTO>>> roomRankList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RoomChatRankEntity>> roomRankingList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RoomWordSensitiveEnrity>> roomSensitiveList(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<List<HoSmashEggResultEntity>>> roomStartGame(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Object>> roomUserPkOp(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Long>> sVipSign(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<Void>> saveDefCP(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Object>> saveGuild(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> saveMessage(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> saveMusicToServer(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<ChargingListEntity>>> saveOfficialWithdrawal(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<LoginEntity>> saveUserInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Integer>> searchPretty(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<BalanceEntity>> sendMessage(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Object>> sendPublicScreenMsg(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<List<SigninDetailEntity>>> signinDetail(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<Object>> switchCallType(@Path("url") String str, @Body Map<String, Object> map);

    @POST
    Observable<HttpResult<TaskInfoEntity>> taskInfo(@Url String str);

    @POST
    Observable<HttpResult<ArrayList<TaskOnlineEntity>>> taskOnlineInfo(@Url String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Integer>> turntableJoinGame(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> ubBindUserRoomRelation(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<RoomChatGiftEntity>> unLockOneMike(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> unlockMedia(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> updateBusyStatus(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> updateNotice(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> updateUserInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> uploadGiftRecords(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Object>> useGiftCard(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Object>> useMicType(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Object>> usePretty(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> useRoomBackground(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<TradeTypeEntity>>> userAccountList(@Path("url") String str, @Body Map<String, Object> map);

    @POST
    Observable<HttpResult<ArrayList<VptUserLevelEntity>>> userLevel(@Url String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> userMessageDelete(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> userMessageSave(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<RoomChatRankEntity.RoomRankingUserVOSDTO>>> userRankList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> userReqMatch(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<Void>> userServiceReport(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<UserEntity>> userStartMatch(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> verifySubOrder(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Boolean>> virtualGood(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<Void>> virtualGoodPurse(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Object>> virtualGoodSend(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> virtualGoodUse(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<MyVisitorListEntity>>> visitorList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<Void>> visitorSave(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<MyVisitorStatEntity>> visitorStat(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<VptCampaignInfoEntity>> vptActInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<VptCampaignRechargeInfoEntity>> vptActRechargeInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptHomeGameEntity>>> vptGameList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptMyGuildMemberEntity>>> vptGuildMemberList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<VptGuildMemberIncomeLogEntity>> vptGuildMemberSingleTotalInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptGuildMemberIncomeLogEntity>>> vptHasJoinGuildInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<LoginEntity>> vptLoginByCode(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<VptGuildInfoEntity>> vptMyGuild(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<VptMyGuildAllStatisticsEntity>> vptMyGuildStatistics(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<String> vptOpenScreenParams2(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<VptRecommendRoomEntity>> vptQueryRecommendRoom(@Path("url") String str);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptMusicEntity>>> vptQueryRoomMusic(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<VptUserEntity>> vptRequestUserDetail(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<VptUpdateEntity>> vptRequestVersionInfo(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<WalletCommonRecordEntity>>> walletRecordLog(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptWeekStartRewardEntity>>> weekGiftAwardList(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<VptWeekStartRankingEntity>>> weekGiftRanking(@Path("url") String str, @Body Map<String, Object> map);

    @POST("{url}")
    Observable<HttpResult<ArrayList<MyWithdrawAccountEntity>>> withdrawAccountList(@Path("url") String str);
}
