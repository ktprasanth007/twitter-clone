/**
 * This class is generated by jOOQ
 */
package tech.codingclub.helix;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<tech.codingclub.helix.tables.records.MemberRecord, java.lang.Long> IDENTITY_MEMBER = Identities0.IDENTITY_MEMBER;
	public static final org.jooq.Identity<tech.codingclub.helix.tables.records.TweetsRecord, java.lang.Long> IDENTITY_TWEETS = Identities0.IDENTITY_TWEETS;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<tech.codingclub.helix.tables.records.FollowersRecord> FOLLOWERS_USER_ID_FOLLOWING_ID_KEY = UniqueKeys0.FOLLOWERS_USER_ID_FOLLOWING_ID_KEY;
	public static final org.jooq.UniqueKey<tech.codingclub.helix.tables.records.MemberRecord> ID = UniqueKeys0.ID;
	public static final org.jooq.UniqueKey<tech.codingclub.helix.tables.records.MemberRecord> MEMBER_ID_KEY = UniqueKeys0.MEMBER_ID_KEY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<tech.codingclub.helix.tables.records.FollowersRecord, tech.codingclub.helix.tables.records.MemberRecord> FOLLOWERS__FOLLOWERS_USER_ID_FKEY = ForeignKeys0.FOLLOWERS__FOLLOWERS_USER_ID_FKEY;
	public static final org.jooq.ForeignKey<tech.codingclub.helix.tables.records.FollowersRecord, tech.codingclub.helix.tables.records.MemberRecord> FOLLOWERS__FOLLOWERS_FOLLOWING_ID_FKEY = ForeignKeys0.FOLLOWERS__FOLLOWERS_FOLLOWING_ID_FKEY;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<tech.codingclub.helix.tables.records.MemberRecord, java.lang.Long> IDENTITY_MEMBER = createIdentity(tech.codingclub.helix.tables.Member.MEMBER, tech.codingclub.helix.tables.Member.MEMBER.ID);
		public static org.jooq.Identity<tech.codingclub.helix.tables.records.TweetsRecord, java.lang.Long> IDENTITY_TWEETS = createIdentity(tech.codingclub.helix.tables.Tweets.TWEETS, tech.codingclub.helix.tables.Tweets.TWEETS.ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<tech.codingclub.helix.tables.records.FollowersRecord> FOLLOWERS_USER_ID_FOLLOWING_ID_KEY = createUniqueKey(tech.codingclub.helix.tables.Followers.FOLLOWERS, tech.codingclub.helix.tables.Followers.FOLLOWERS.USER_ID, tech.codingclub.helix.tables.Followers.FOLLOWERS.FOLLOWING_ID);
		public static final org.jooq.UniqueKey<tech.codingclub.helix.tables.records.MemberRecord> ID = createUniqueKey(tech.codingclub.helix.tables.Member.MEMBER, tech.codingclub.helix.tables.Member.MEMBER.ID);
		public static final org.jooq.UniqueKey<tech.codingclub.helix.tables.records.MemberRecord> MEMBER_ID_KEY = createUniqueKey(tech.codingclub.helix.tables.Member.MEMBER, tech.codingclub.helix.tables.Member.MEMBER.ID);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<tech.codingclub.helix.tables.records.FollowersRecord, tech.codingclub.helix.tables.records.MemberRecord> FOLLOWERS__FOLLOWERS_USER_ID_FKEY = createForeignKey(tech.codingclub.helix.Keys.ID, tech.codingclub.helix.tables.Followers.FOLLOWERS, tech.codingclub.helix.tables.Followers.FOLLOWERS.USER_ID);
		public static final org.jooq.ForeignKey<tech.codingclub.helix.tables.records.FollowersRecord, tech.codingclub.helix.tables.records.MemberRecord> FOLLOWERS__FOLLOWERS_FOLLOWING_ID_FKEY = createForeignKey(tech.codingclub.helix.Keys.ID, tech.codingclub.helix.tables.Followers.FOLLOWERS, tech.codingclub.helix.tables.Followers.FOLLOWERS.FOLLOWING_ID);
	}
}
