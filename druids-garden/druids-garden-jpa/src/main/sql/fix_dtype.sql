BEGIN;

ALTER TABLE action DROP COLUMN IF EXISTS dtype;
ALTER TABLE action ADD COLUMN dtype character varying(31) NOT NULL;
ALTER TABLE actor DROP COLUMN IF EXISTS dtype;
ALTER TABLE actor ADD COLUMN dtype character varying(31) NOT NULL;
ALTER TABLE effect DROP COLUMN IF EXISTS dtype;
ALTER TABLE effect ADD COLUMN dtype character varying(31) NOT NULL;
ALTER TABLE period DROP COLUMN IF EXISTS dtype;
ALTER TABLE period ADD COLUMN dtype character varying(31) NOT NULL;

\d action
\d actor
\d effect
\d period

COMMIT;