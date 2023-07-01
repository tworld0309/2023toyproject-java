
CREATE TABLE TB_ADMIN
(
  admin_id       varchar(20)  NOT NULL COMMENT '관리자ID',
  admin_hotel_id varchar(20)  NOT NULL COMMENT '관리자_호텔id',
  admin_password varchar(20)  NULL     COMMENT '관리자_비밀번호',
  admin_nm       varchar(20)  NULL     COMMENT '관리자명',
  admin_role_cd  varchar(10)  NULL     COMMENT '역할코드',
  admin_email    varchar(100) NULL     COMMENT '관리자이메일주소',
  admin_phone    varchar(15)  NULL     COMMENT '관리자연락처',
  reg_id         varchar(20)  NULL     COMMENT '등록자ID',
  reg_dt         date         NULL     COMMENT '등록일시',
  mod_id         varchar(20)  NULL     COMMENT '수정자ID',
  mod_dt         date         NULL     COMMENT '수정일시',
  PRIMARY KEY (admin_id, admin_hotel_id)
) COMMENT '관리자';

CREATE TABLE TB_ASSIGN
(
  assign_id              varchar(10) NOT NULL COMMENT '배정번호',
  reservation_id         varchar(10) NOT NULL COMMENT '예약번호',
  hotel_cd               varchar(20) NOT NULL COMMENT '호텔 코드',
  room_cd                varchar(20) NOT NULL COMMENT '룸 코드',
  status_cd              varchar(10) NULL     COMMENT '상태코드',
  checkin_dt             date        NULL     COMMENT '체크인_일시',
  real_checkin_admin_id  varchar(20) NOT NULL COMMENT '실_체크인_담당자',
  checkout_dt            date        NULL     COMMENT '체크아웃_일시',
  real_checkout_admin_id varchar(20) NOT NULL COMMENT '실_체크아웃_담당자',
  reg_id                 varchar(20) NULL     COMMENT '등록자ID',
  reg_dt                 date        NULL     COMMENT '등록일시',
  mod_id                 varchar(20) NULL     COMMENT '수정자ID',
  mod_dt                 date        NULL     COMMENT '수정일시',
  PRIMARY KEY (assign_id)
) COMMENT '배정';

CREATE TABLE TB_CM_CODE
(
  code        varchar(10)  NOT NULL COMMENT '공통코드',
  name        varchar(20)  NULL     COMMENT '공통코드명',
  description varchar(100) NULL     COMMENT '설명',
  reg_id      varchar(20)  NULL     COMMENT '등록자ID',
  reg_dt      date         NULL     COMMENT '등록일시',
  mod_id      varchar(20)  NULL     COMMENT '수정자ID',
  mod_dt      date         NULL     COMMENT '수정일시',
  PRIMARY KEY (code)
) COMMENT '공통코드';

CREATE TABLE TB_CM_DT_CODE
(
  code    varchar(10)  NOT NULL COMMENT '공통코드',
  dt_code varchar(20)  NOT NULL COMMENT '공통세부코드',
  dt_name varchar(20)  NULL     COMMENT '공통세부코드명',
  dt_desc varchar(100) NULL     COMMENT '설명',
  reg_id  varchar(20)  NULL     COMMENT '등록자ID',
  reg_dt  date         NULL     COMMENT '등록일시',
  mod_id  varchar(20)  NULL     COMMENT '수정자ID',
  mod_dt  date         NULL     COMMENT '수정일시',
  PRIMARY KEY (dt_code)
) COMMENT '공통세부코드';

CREATE TABLE TB_GRADE_ROOM
(
  reservation_date varchar(8)  NOT NULL COMMENT '일자',
  hotel_cd         varchar(20) NOT NULL COMMENT '호텔 코드',
  room_grade_cd    varchar(10) NOT NULL COMMENT '등급 코드',
  total_cnt        int         NULL     COMMENT '총개수',
  reserved_cnt     int         NULL     COMMENT '예약개수',
  reg_id           varchar(20) NULL     COMMENT '등록자ID',
  reg_dt           date        NULL     COMMENT '등록일시',
  mod_id           varchar(20) NULL     COMMENT '수정자ID',
  mod_dt           date        NULL     COMMENT '수정일시',
  PRIMARY KEY (reservation_date, hotel_cd, room_grade_cd)
) COMMENT '방 등급 정보';

CREATE TABLE TB_HOTEL
(
  hotel_cd       varchar(20)  NOT NULL COMMENT '호텔 코드',
  hotel_nm       varchar(30)  NULL     COMMENT '호텔 명',
  hotel_grade_cd varchar(10)  NULL     COMMENT '호텔 등급 코드',
  hotel_address  varchar(50)  NULL     COMMENT '호텔_기본주소',
  hotel_address2 varchar(100) NULL     COMMENT '호텔_상세주소',
  hotel_zipcode  varchar(10)  NULL     COMMENT '호텔_우편번호',
  hotel_phone    varchar(15)  NULL     COMMENT '호텔_전화번호',
  reg_id         varchar(20)  NULL     COMMENT '등록자ID',
  reg_dt         date         NULL     COMMENT '등록일시',
  mod_id         varchar(20)  NULL     COMMENT '수정자ID',
  mod_dt         date         NULL     COMMENT '수정일시',
  PRIMARY KEY (hotel_cd)
) COMMENT '호텔 정보';

CREATE TABLE TB_RESERVATION
(
  reservation_id  varchar(10)  NOT NULL COMMENT '예약번호',
  cust_id         varchar(20)  NOT NULL COMMENT '사용자ID',
  hotel_cd        varchar(20)  NOT NULL COMMENT '호텔 코드',
  room_grade_cd   varchar(10)  NULL     COMMENT '등급 코드',
  payment_dt      date         NULL     COMMENT '결제일시',
  payment_cd      varchar(10)  NULL     COMMENT '결제수단 코드',
  payment_price   int          NULL     COMMENT '결제 금액',
  invoice         varchar(20)  NULL     COMMENT '승인번호',
  special_request varchar(200) NULL     COMMENT '추가요구사항',
  vaild_yn        char(1)      NULL     COMMENT '유효여부(Y-정상, N-비정상, C-취소)',
  status_cd       varchar(10)  NULL     COMMENT '예약상태(임시,저장,대기,취소)',
  reg_id          varchar(20)  NULL     COMMENT '등록자ID',
  reg_dt          date         NULL     COMMENT '등록일시',
  mod_id          varchar(20)  NULL     COMMENT '수정자ID',
  mod_dt          date         NULL     COMMENT '수정일시',
  PRIMARY KEY (reservation_id)
) COMMENT '예약관리';

CREATE TABLE TB_ROOM
(
  hotel_cd       varchar(20) NOT NULL COMMENT '호텔 코드',
  room_cd        varchar(20) NOT NULL COMMENT '룸 코드',
  room_nm        varchar(30) NULL     COMMENT '룸 명',
  room_status_cd varchar(10) NULL     COMMENT '룸 상태코드',
  room_floor     int         NULL     COMMENT '층',
  room_grade_cd  varchar(10) NULL     COMMENT '등급 코드',
  reg_id         varchar(20) NULL     COMMENT '등록자ID',
  reg_dt         date        NULL     COMMENT '등록일시',
  mod_id         varchar(20) NULL     COMMENT '수정자ID',
  mod_dt         date        NULL     COMMENT '수정일시',
  PRIMARY KEY (hotel_cd, room_cd)
) COMMENT '방 정보';

CREATE TABLE TB_USER
(
  cust_id               varchar(20)  NOT NULL COMMENT '고객ID',
  cust_password         varchar(20)  NULL     COMMENT '고객_비밀번호',
  cust_email            varchar(100) NULL     COMMENT '고객이메일주소',
  cust_nm               varchar(20)  NULL     COMMENT '고객명',
  cust_birth_dt         date         NULL     COMMENT '고객생년월일',
  cust_phone            varchar(15)  NULL     COMMENT '고객연락처',
  cust_grade_cd         varchar(10)  NULL     COMMENT '고객등급코드',
  cust_grade_modi_dt    date         NULL     COMMENT '최근고객등급변경일',
  cust_grade_modi_admin varchar(20)  NULL     COMMENT '최근고객등급변경자',
  cust_type_cd          varchar(10)  NULL     COMMENT '고객구분(내국인,외국인)',
  cust_address          varchar(50)  NULL     COMMENT '기본주소',
  cust_address2         varchar(100) NULL     COMMENT '상세주소',
  cust_zipcode          varchar(10)  NULL     COMMENT '우편번호',
  reg_id                varchar(20)  NULL     COMMENT '등록자ID',
  reg_dt                date         NULL     COMMENT '등록일시',
  mod_id                varchar(20)  NULL     COMMENT '수정자ID',
  mod_dt                date         NULL     COMMENT '수정일시',
  PRIMARY KEY (cust_id)
) COMMENT '사용자';

ALTER TABLE TB_RESERVATION
  ADD CONSTRAINT FK_TB_USER_TO_TB_RESERVATION
    FOREIGN KEY (cust_id)
    REFERENCES TB_USER (cust_id);

ALTER TABLE TB_ASSIGN
  ADD CONSTRAINT FK_TB_RESERVATION_TO_TB_ASSIGN
    FOREIGN KEY (reservation_id)
    REFERENCES TB_RESERVATION (reservation_id);

ALTER TABLE TB_ASSIGN
  ADD CONSTRAINT FK_TB_ROOM_TO_TB_ASSIGN
    FOREIGN KEY (room_cd)
    REFERENCES TB_ROOM (room_cd);

ALTER TABLE TB_CM_DT_CODE
  ADD CONSTRAINT FK_TB_CM_CODE_TO_TB_CM_DT_CODE
    FOREIGN KEY (code)
    REFERENCES TB_CM_CODE (code);

ALTER TABLE TB_ROOM
  ADD CONSTRAINT FK_TB_HOTEL_TO_TB_ROOM
    FOREIGN KEY (hotel_cd)
    REFERENCES TB_HOTEL (hotel_cd);

ALTER TABLE TB_GRADE_ROOM
  ADD CONSTRAINT FK_TB_HOTEL_TO_TB_GRADE_ROOM
    FOREIGN KEY (hotel_cd)
    REFERENCES TB_HOTEL (hotel_cd);
