import React from "react";
import { useTranslation } from "react-i18next";
import { renderValidDate } from "../../../utils/dateUtils";

/**
 * This component renders the submitted date cells of jobs in the table view
 */
const JobsSubmittedCell = ({
    row
}: any) => {
	const { t } = useTranslation();

	return (
		<span>
			{t("dateFormats.dateTime.short", { dateTime: renderValidDate(row.submitted) })}
		</span>
	);
};

export default JobsSubmittedCell;
