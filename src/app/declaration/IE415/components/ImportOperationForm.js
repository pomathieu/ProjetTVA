"use client";
import { useFormContext } from "react-hook-form";
import { Accordion, AccordionSummary, AccordionDetails, TextField, Box, Grid } from "@mui/material";
import ExpandMoreIcon from '@mui/icons-material/ExpandMore';
import CheckCircleIcon from '@mui/icons-material/CheckCircle';
import { ImportOperation as ImportOperationSchema } from "../schema/ie415schema";

export default function ImportOperationForm() {
    const { register, getValues, formState: { errors } } = useFormContext();

    // Function to check if ImportOperation fields are valid
    const isImportOperationValid = () => {
        try {
          const values = getValues();
          const importOperationValues = values.ImportOperation; // extract only ImportOperation fields
          ImportOperationSchema.validateSync(importOperationValues);
          return true;
        } catch (error) {
          return false;
        }
      };

    return (
        <Box width={1}>
            <Accordion defaultExpanded>
                <AccordionSummary
                    expandIcon={<ExpandMoreIcon />}
                    id="import-operation"
                >
                    <label>Import Operation</label>
                    {isImportOperationValid() && <CheckCircleIcon style={{ color: 'purple', marginLeft: '10px' }} />}
                </AccordionSummary>
                <AccordionDetails>
                    <Grid container spacing={2}>
                        <Grid item xs={6}>
                            <TextField
                                {...register("ImportOperation.LRN")}
                                id="LRN"
                                label="LRN"
                                variant="outlined"
                                size="small"
                                error={Boolean(errors.ImportOperation?.LRN)}
                                helperText={errors.ImportOperation?.LRN?.message}
                                fullWidth
                            />
                        </Grid>
                        <Grid item xs={6}>
                            <TextField
                                {...register("ImportOperation.declarationType")}
                                id="declarationType"
                                label="Declaration Type"
                                variant="outlined"
                                size="small"
                                error={Boolean(errors.ImportOperation?.declarationType)}
                                helperText={errors.ImportOperation?.declarationType?.message}
                                fullWidth
                            />
                        </Grid>
                        <Grid item xs={6}>
                            <TextField
                                {...register("ImportOperation.additionalDeclarationType")}
                                id="additionalDeclarationType"
                                label="Additional Declaration Type"
                                variant="outlined"
                                size="small"
                                error={Boolean(errors.ImportOperation?.additionalDeclarationType)}
                                helperText={errors.ImportOperation?.additionalDeclarationType?.message}
                                fullWidth
                            />
                        </Grid>
                        <Grid item xs={6}>
                            <TextField
                                {...register("ImportOperation.presentationNotificationEstimatedDateAndTime")}
                                id="presentationNotificationEstimatedDateAndTime"
                                label="Presentation Notification Estimated Date And Time"
                                variant="outlined"
                                size="small"
                                error={Boolean(errors.ImportOperation?.presentationNotificationEstimatedDateAndTime)}
                                helperText={errors.ImportOperation?.presentationNotificationEstimatedDateAndTime?.message}
                                fullWidth
                            />
                        </Grid>
                        <Grid item xs={6}>
                            <TextField
                                {...register("ImportOperation.languageCode")}
                                id="languageCode"
                                label="Language Code"
                                variant="outlined"
                                size="small"
                                error={Boolean(errors.ImportOperation?.languageCode)}
                                helperText={errors.ImportOperation?.languageCode?.message}
                                fullWidth
                            />
                        </Grid>
                    </Grid>
                </AccordionDetails>
            </Accordion>
        </Box>
    );
}
