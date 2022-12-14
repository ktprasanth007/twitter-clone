/**
 * This class is generated by jOOQ
 */
package tech.codingclub.helix.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MemberRecord extends org.jooq.impl.UpdatableRecordImpl<tech.codingclub.helix.tables.records.MemberRecord> implements org.jooq.Record10<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Long, java.lang.Boolean> {

	private static final long serialVersionUID = 1303740366;

	/**
	 * Setter for <code>public.member.first_name</code>.
	 */
	public void setFirstName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.member.first_name</code>.
	 */
	public java.lang.String getFirstName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>public.member.last_name</code>.
	 */
	public void setLastName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.member.last_name</code>.
	 */
	public java.lang.String getLastName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.member.email</code>.
	 */
	public void setEmail(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.member.email</code>.
	 */
	public java.lang.String getEmail() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.member.role</code>.
	 */
	public void setRole(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.member.role</code>.
	 */
	public java.lang.String getRole() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>public.member.password</code>.
	 */
	public void setPassword(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.member.password</code>.
	 */
	public java.lang.String getPassword() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>public.member.image</code>.
	 */
	public void setImage(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.member.image</code>.
	 */
	public java.lang.String getImage() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>public.member.token</code>.
	 */
	public void setToken(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.member.token</code>.
	 */
	public java.lang.String getToken() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>public.member.is_verified</code>.
	 */
	public void setIsVerified(java.lang.Boolean value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.member.is_verified</code>.
	 */
	public java.lang.Boolean getIsVerified() {
		return (java.lang.Boolean) getValue(7);
	}

	/**
	 * Setter for <code>public.member.id</code>.
	 */
	public void setId(java.lang.Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.member.id</code>.
	 */
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(8);
	}

	/**
	 * Setter for <code>public.member.is_image_uploaded</code>.
	 */
	public void setIsImageUploaded(java.lang.Boolean value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.member.is_image_uploaded</code>.
	 */
	public java.lang.Boolean getIsImageUploaded() {
		return (java.lang.Boolean) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Long, java.lang.Boolean> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Long, java.lang.Boolean> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return tech.codingclub.helix.tables.Member.MEMBER.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return tech.codingclub.helix.tables.Member.MEMBER.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return tech.codingclub.helix.tables.Member.MEMBER.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return tech.codingclub.helix.tables.Member.MEMBER.ROLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return tech.codingclub.helix.tables.Member.MEMBER.PASSWORD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return tech.codingclub.helix.tables.Member.MEMBER.IMAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return tech.codingclub.helix.tables.Member.MEMBER.TOKEN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field8() {
		return tech.codingclub.helix.tables.Member.MEMBER.IS_VERIFIED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field9() {
		return tech.codingclub.helix.tables.Member.MEMBER.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field10() {
		return tech.codingclub.helix.tables.Member.MEMBER.IS_IMAGE_UPLOADED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getRole();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getPassword();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getImage();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getToken();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value8() {
		return getIsVerified();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value9() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value10() {
		return getIsImageUploaded();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRecord value1(java.lang.String value) {
		setFirstName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRecord value2(java.lang.String value) {
		setLastName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRecord value3(java.lang.String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRecord value4(java.lang.String value) {
		setRole(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRecord value5(java.lang.String value) {
		setPassword(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRecord value6(java.lang.String value) {
		setImage(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRecord value7(java.lang.String value) {
		setToken(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRecord value8(java.lang.Boolean value) {
		setIsVerified(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRecord value9(java.lang.Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRecord value10(java.lang.Boolean value) {
		setIsImageUploaded(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.Boolean value8, java.lang.Long value9, java.lang.Boolean value10) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MemberRecord
	 */
	public MemberRecord() {
		super(tech.codingclub.helix.tables.Member.MEMBER);
	}

	/**
	 * Create a detached, initialised MemberRecord
	 */
	public MemberRecord(java.lang.String firstName, java.lang.String lastName, java.lang.String email, java.lang.String role, java.lang.String password, java.lang.String image, java.lang.String token, java.lang.Boolean isVerified, java.lang.Long id, java.lang.Boolean isImageUploaded) {
		super(tech.codingclub.helix.tables.Member.MEMBER);

		setValue(0, firstName);
		setValue(1, lastName);
		setValue(2, email);
		setValue(3, role);
		setValue(4, password);
		setValue(5, image);
		setValue(6, token);
		setValue(7, isVerified);
		setValue(8, id);
		setValue(9, isImageUploaded);
	}
}
