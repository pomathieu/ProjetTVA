"use client";
import { useFormContext } from "react-hook-form";
import { Accordion, AccordionSummary, AccordionDetails, TextField, Box, Grid } from "@mui/material";
import ExpandMoreIcon from '@mui/icons-material/ExpandMore';
import CheckCircleIcon from '@mui/icons-material/CheckCircle';
import { Autorisation as AutorisationSchema } from "../schema/ie415schema";

export default function AutorisationForm() {
    const { register, getValues, formState: { errors }} = useFormContext();

    const isAutorisationValid = () => {
        try {
          const values = getValues();
          const AutorisationValues = values.Autorisation; // extract only ImportOperation fields
          AutorisationSchema.validateSync(AutorisationValues);
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
                id="autorisation"
            >
                <label>Autorisation</label>
                {isAutorisationValid() && <CheckCircleIcon style={{ color: 'purple', marginLeft: '10px' }} />}
            </AccordionSummary>
            <AccordionDetails>
                <Grid container spacing={2}>
                <Grid item xs={6}>
                    <TextField
                    {...register("Autorisation.sequenceNumber")}
                    id="sequenceNumber"
                    label="Numéro de séquence"
                    variant="outlined"
                    size="small"
                    error={Boolean(errors.Autorisation?.sequenceNumber)}
                    helperText={errors.Autorisation?.sequenceNumber?.message}
                    fullWidth
                    />
                </Grid>
                <Grid item xs={6}>
                    <TextField
                    {...register("Autorisation.type")}
                    id="type"
                    label="Type"
                    variant="outlined"
                    size="small"
                    error={Boolean(errors.Autorisation?.type)}
                    helperText={errors.Autorisation?.type?.message}
                    fullWidth
                    />
                </Grid>
                <Grid item xs={6}>
                    <TextField
                    {...register("Autorisation.referenceNumber")}
                    id="referenceNumber"
                    label="Numéro de référence de l'autorisation"
                    variant="outlined"
                    size="small"
                    error={Boolean(errors.Autorisation?.referenceNumber)}
                    helperText={errors.Autorisation?.referenceNumber?.message}
                    fullWidth
                    />
                </Grid>
                <Grid item xs={6}>
                    <TextField
                    {...register("Autorisation.holderOfTheAuthorisation")}
                    id="holderOfTheAuthorisation"
                    label="Titulaire de l'autorisation"
                    variant="outlined"
                    size="small"
                    error={Boolean(errors.Autorisation?.holderOfTheAuthorisation)}
                    helperText={errors.Autorisation?.holderOfTheAuthorisation?.message}
                    fullWidth
                    />
                </Grid>
                </Grid>
            </AccordionDetails>
            </Accordion>
      </Box>
    );
  }